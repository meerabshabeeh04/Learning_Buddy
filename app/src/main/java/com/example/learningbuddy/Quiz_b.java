package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz_b extends AppCompatActivity {
    Button buttonb;
    TextView cab1,cab2,cab3,cab4,cab5,tvb3;
    RadioGroup rgb1,rgb2,rgb3,rgb4,rgb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_b);
        buttonb=findViewById(R.id.btnb5);
        cab1=findViewById(R.id.cab1);
        cab2=findViewById(R.id.cab2);
        cab3=findViewById(R.id.cab3);
        cab4=findViewById(R.id.cab4);
        cab5=findViewById(R.id.cab5);
        rgb1=findViewById(R.id.rgb1);
        rgb2=findViewById(R.id.rgb2);
        rgb3=findViewById(R.id.rgb3);
        rgb4=findViewById(R.id.rgb4);
        rgb5=findViewById(R.id.rgb5);
        tvb3=findViewById(R.id.tvb3);
        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score=0;
                int radioidb1=rgb1.getCheckedRadioButtonId();
                if (radioidb1==R.id.rbb2){
                    score++;
                    RadioButton radioButtonb1=findViewById(R.id.rbb2);
                }
                int radioidb2=rgb2.getCheckedRadioButtonId();
                if (radioidb2==R.id.rbb6){
                    score++;
                }
                int radioidb3=rgb3.getCheckedRadioButtonId();
                if (radioidb3==R.id.rbb10){
                    score++;
                }
                int radioidb4=rgb4.getCheckedRadioButtonId();
                if (radioidb4==R.id.rbb16){
                    score++;
                }
                int radioidb5=rgb5.getCheckedRadioButtonId();
                if (radioidb5==R.id.rbb20){
                    score++;
                }
                tvb3.setText("Your Score:"+score);
                cab1.setText("Correct Answer : Not pure");
                cab2.setText("Correct Answer : 24");
                cab3.setText("Correct Answer : Decision Tree");
                cab4.setText("Correct Answer : Attributes are statistically independent of one another given the class value.");
                cab5.setText("Correct Answer : Density-based clustering");
                if (score==5){
                    Intent intent=new Intent(Quiz_b.this,FinalActivity.class);
                    intent.putExtra("Course Name","Machine Learning");
                    startActivity(intent);
                }
            }
        });
    }
}