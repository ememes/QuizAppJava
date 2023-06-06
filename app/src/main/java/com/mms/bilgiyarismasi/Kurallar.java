package com.mms.bilgiyarismasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mms.bilgiyarismasi.databinding.ActivityKurallarBinding;
import com.mms.bilgiyarismasi.databinding.ActivityMainBinding;


public class Kurallar extends AppCompatActivity {
    private ActivityKurallarBinding binding;
    Button kurallarOyun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityKurallarBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        binding.kurallarOyun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

}