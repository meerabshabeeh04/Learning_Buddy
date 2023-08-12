package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz_g extends AppCompatActivity {
    Button buttong;
    TextView cag1,cag2,cag3,cag4,cag5,tvg3;
    RadioGroup rgg1,rgg2,rgg3,rgg4,rgg5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_g);
        buttong=findViewById(R.id.btng5);
        cag1=findViewById(R.id.cag1);
        cag2=findViewById(R.id.cag2);
        cag3=findViewById(R.id.cag3);
        cag4=findViewById(R.id.cag4);
        cag5=findViewById(R.id.cag5);
        rgg1=findViewById(R.id.rgg1);
        rgg2=findViewById(R.id.rgg2);
        rgg3=findViewById(R.id.rgg3);
        rgg4=findViewById(R.id.rgg4);
        rgg5=findViewById(R.id.rgg5);
        tvg3=findViewById(R.id.tvg3);
        buttong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score=0;
                int radioidg1=rgg1.getCheckedRadioButtonId();
                if (radioidg1==R.id.rbg2){
                    score++;
                    RadioButton radioButtong1=findViewById(R.id.rbg2);
                }
                int radioidg2=rgg2.getCheckedRadioButtonId();
                if (radioidg2==R.id.rbg6){
                    score++;
                }
                int radioidg3=rgg3.getCheckedRadioButtonId();
                if (radioidg3==R.id.rbg10){
                    score++;
                }
                int radioidg4=rgg4.getCheckedRadioButtonId();
                if (radioidg4==R.id.rbg16){
                    score++;
                }
                int radioidg5=rgg5.getCheckedRadioButtonId();
                if (radioidg5==R.id.rbg20){
                    score++;
                }
                tvg3.setText("Your Score:"+score);
                cag1.setText("Correct Answer : Hyper Text Markup Language");
                cag2.setText("Correct Answer : <h6>");
                cag3.setText("Correct Answer : <lb>");
                cag4.setText("Correct Answer : <table><tr><tt>");
                cag5.setText("Correct Answer : <list>");
                if (score==5) {
                    Intent intent = new Intent(Quiz_g.this, FinalActivity.class);
                    intent.putExtra("Course Name", "Web Development");
                    startActivity(intent);
                }
            }
        });
    }
}