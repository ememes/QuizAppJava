package com.mms.bilgiyarismasi;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tvName = findViewById(R.id.tv_name);
        TextView tvScore = findViewById(R.id.tv_score);
        Button btnFinish = findViewById(R.id.btn_finish);

        tvName.setText(getIntent().getStringExtra(Constants.getUserName()));
        int correctAnswers = getIntent().getIntExtra(Constants.getCorrectAnswer(), 0);
        int totalQuestions = getIntent().getIntExtra(Constants.getTotalQuestions(), 0);




        tvScore.setText(+ totalQuestions + " sorudan " + correctAnswers + " tanesini doğru cevapladınız." );
        btnFinish.setOnClickListener(view -> {
            Intent intent = new Intent(ResultActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}