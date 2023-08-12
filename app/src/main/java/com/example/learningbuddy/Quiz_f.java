package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz_f extends AppCompatActivity {
    Button buttonf;
    TextView caf1,caf2,caf3,caf4,caf5,tvf3;
    RadioGroup rgf1,rgf2,rgf3,rgf4,rgf5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_f);
        buttonf=findViewById(R.id.btnf5);
        caf1=findViewById(R.id.caf1);
        caf2=findViewById(R.id.caf2);
        caf3=findViewById(R.id.caf3);
        caf4=findViewById(R.id.caf4);
        caf5=findViewById(R.id.caf5);
        rgf1=findViewById(R.id.rgf1);
        rgf2=findViewById(R.id.rgf2);
        rgf3=findViewById(R.id.rgf3);
        rgf4=findViewById(R.id.rgf4);
        rgf5=findViewById(R.id.rgf5);
        tvf3=findViewById(R.id.tvf3);
        buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score=0;
                int radioidf1=rgf1.getCheckedRadioButtonId();
                if (radioidf1==R.id.rbf2){
                    score++;
                    RadioButton radioButtonf1=findViewById(R.id.rbf2);
                }
                int radioidf2=rgf2.getCheckedRadioButtonId();
                if (radioidf2==R.id.rbf6){
                    score++;
                }
                int radioidf3=rgf3.getCheckedRadioButtonId();
                if (radioidf3==R.id.rbf10){
                    score++;
                }
                int radioidf4=rgf4.getCheckedRadioButtonId();
                if (radioidf4==R.id.rbf16){
                    score++;
                }
                int radioidf5=rgf5.getCheckedRadioButtonId();
                if (radioidf5==R.id.rbf20){
                    score++;
                }
                tvf3.setText("Your Score:"+score);
                caf1.setText("Correct Answer : A scenario");
                caf2.setText("Correct Answer : Assets");
                caf3.setText("Correct Answer : project View");
                caf4.setText("Correct Answer : Frame");
                caf5.setText("Correct Answer : Frame");
                if (score==5) {
                    Intent intent = new Intent(Quiz_f.this, FinalActivity.class);
                    intent.putExtra("Course Name", "Game Development");
                    startActivity(intent);
                }
            }
        });
    }
}