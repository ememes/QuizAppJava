package com.mms.bilgiyarismasi;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.List;

public class QuizQuestionsSpor extends AppCompatActivity implements View.OnClickListener {

    private int mCurrentPosition = 0;
    private List<Question> mQuestionsList = null;
    private int mSelectedOptionPosition = -1;
    private String mUserName = null;
    private int mCorrectAnswers = 0;

    private ProgressBar progressBar;
    private TextView tvProgress;
    private TextView tvQuestion;
    private ImageView ivImage;
    private TextView[] tvOptions;
    private Button btnSubmit;

    private TextView timerTextView;
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_questions);
        mQuestionsList = Constants.getQuestionsList3();

        mUserName = getIntent().getStringExtra(Constants.getUserName());


        timerTextView = findViewById(R.id.timerTextView);
        startTimer();

        progressBar = findViewById(R.id.progressBar);
        progressBar.setMax(mQuestionsList.size());
        tvProgress = findViewById(R.id.tv_progress);
        tvQuestion = findViewById(R.id.tv_question);
        ivImage = findViewById(R.id.iv_image);
        tvOptions = new TextView[4];
        tvOptions[0] = findViewById(R.id.option_one);
        tvOptions[1] = findViewById(R.id.option_two);
        tvOptions[2] = findViewById(R.id.option_three);
        tvOptions[3] = findViewById(R.id.option_four);
        btnSubmit = findViewById(R.id.btn_submit);

        for (TextView tvOption : tvOptions) {
            tvOption.setOnClickListener(this);
        }
        btnSubmit.setOnClickListener(this);

        setCurrentQuestion();
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(60000, 1000) {
            public void onTick(long millisUntilFinished) {
                long seconds = millisUntilFinished / 1000;
                timerTextView.setText("Kalan Süre: " + seconds + " sn");
            }

            public void onFinish() {
                timerTextView.setText("Süre Doldu!");
                redirectToResultActivity();
            }
        }.start();
    }

    private void redirectToResultActivity() {
        Intent intent = new Intent(this, ResultActivity.class);
        startActivity(intent);
        finish();
    }

    private void setCurrentQuestion() {
        defaultOptionsView();
        Question currQuestion = mQuestionsList.get(mCurrentPosition);
        ivImage.setImageResource(currQuestion.getImage());
        progressBar.setProgress(mCurrentPosition + 1);
        tvProgress.setText(String.format("%s/%s", mCurrentPosition + 1, progressBar.getMax()));
        tvQuestion.setText(currQuestion.getQuestion());
        for (int i = 0; i < currQuestion.getOptions().length; i++) {
            tvOptions[i].setText(currQuestion.getOptions()[i]);
        }

        if (mCurrentPosition == mQuestionsList.size()) {
            btnSubmit.setText("SON SORUYU CEVAPLA");
        } else {
            btnSubmit.setText("YANITLA");
        }
    }

    private void defaultOptionsView() {
        for (TextView option : tvOptions) {
            option.setTextColor(Color.parseColor("#7A8089"));
            option.setTypeface(Typeface.DEFAULT);
            option.setBackground(ContextCompat.getDrawable(this, R.drawable.default_option_border_bg));
        }
    }

    private void selectedOptionView(TextView tv, int selectedOptionNum) {
        defaultOptionsView();
        mSelectedOptionPosition = selectedOptionNum;
        tv.setTextColor(Color.parseColor("#363A43"));
        tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
        tv.setBackground(ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg));
    }

    private void answerView(int ans, int drawableView) {
        tvOptions[ans].setBackground(ContextCompat.getDrawable(this, drawableView));
        tvOptions[ans].setTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.option_one) {
            selectedOptionView(tvOptions[0], 0);
        } else if (view.getId() == R.id.option_two) {
            selectedOptionView(tvOptions[1], 1);
        } else if (view.getId() == R.id.option_three) {
            selectedOptionView(tvOptions[2], 2);
        } else if (view.getId() == R.id.option_four) {
            selectedOptionView(tvOptions[3], 3);
        } else if (view.getId() == R.id.btn_submit) {
            if (mSelectedOptionPosition == -1) {
                if (mCurrentPosition + 1 < mQuestionsList.size()) {
                    mCurrentPosition++;
                    setCurrentQuestion();
                } else {
                    Intent intent = new Intent(QuizQuestionsSpor.this, ResultActivity.class);
                    countDownTimer.cancel();
                    intent.putExtra(Constants.getUserName(), mUserName);
                    intent.putExtra(Constants.getCorrectAnswer(), mCorrectAnswers);
                    intent.putExtra(Constants.getTotalQuestions(), mQuestionsList.size());
                    startActivity(intent);
                }
            } else {
                Question question = mQuestionsList.get(mCurrentPosition);
                if (mSelectedOptionPosition != question.getCorrectAns()) {
                    answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg);
                } else {
                    mCorrectAnswers++;
                }
                answerView(question.getCorrectAns(), R.drawable.correct_option_border_bg);

                if (mCurrentPosition + 1 < mQuestionsList.size()) {
                    btnSubmit.setText("SONRAKİ SORUYA GEÇ");
                } else {
                    btnSubmit.setText("SON SORUYU CEVAPLA");
                }
                // resetting the option selected
                mSelectedOptionPosition = -1;
            }
        }
    }
    public void onBackPressed() {
        super.onBackPressed();
        countDownTimer.cancel();
    }
}