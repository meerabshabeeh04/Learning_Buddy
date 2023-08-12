package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.learningbuddy.R;

public class Quiz_a extends AppCompatActivity {

    Button button;
    TextView ca1,ca2,ca3,ca4,ca5,tv3;
    RadioGroup rg1,rg2,rg3,rg4,rg5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        button=findViewById(R.id.btn5);
        ca1=findViewById(R.id.ca1);
        ca2=findViewById(R.id.ca2);
        ca3=findViewById(R.id.ca3);
        ca4=findViewById(R.id.ca4);
        ca5=findViewById(R.id.ca5);
        rg1=findViewById(R.id.rg1);
        rg2=findViewById(R.id.rg2);
        rg3=findViewById(R.id.rg3);
        rg4=findViewById(R.id.rg4);
        rg5=findViewById(R.id.rg5);
        tv3=findViewById(R.id.tv3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score=0;
                int radioid1=rg1.getCheckedRadioButtonId();
                if (radioid1==R.id.rb2){
                    score++;
                    RadioButton radioButton1=findViewById(R.id.rb2);
                }
                int radioid2=rg2.getCheckedRadioButtonId();
                if (radioid2==R.id.rb6){
                    score++;
                }
                int radioid3=rg3.getCheckedRadioButtonId();
                if (radioid3==R.id.rb10){
                    score++;
                }
                int radioid4=rg4.getCheckedRadioButtonId();
                if (radioid4==R.id.rb16){
                    score++;
                }
                int radioid5=rg5.getCheckedRadioButtonId();
                if (radioid5==R.id.rb20){
                    score++;
                }
                tv3.setText("Your Score:"+score);
                ca1.setText("Correct Answer : Making a Machine Intelligent");
                ca2.setText("Correct Answer : Small Search Space");
                ca3.setText("Correct Answer : Depth First Search");
                ca4.setText("Correct Answer : Intelligent");
                ca5.setText("Correct Answer : Perl");
                if (score==5){
                    Intent intent=new Intent(Quiz_a.this,FinalActivity.class);
                    intent.putExtra("Course Name","Artificial Intelligence");
                    startActivity(intent);
                }
            }
        });
    }

}