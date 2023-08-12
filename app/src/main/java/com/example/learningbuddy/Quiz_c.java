package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz_c extends AppCompatActivity {
    Button buttonc;
    TextView cac1,cac2,cac3,cac4,cac5,tvc3;
    RadioGroup rgc1,rgc2,rgc3,rgc4,rgc5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_c);
        buttonc=findViewById(R.id.btnc5);
        cac1=findViewById(R.id.cac1);
        cac2=findViewById(R.id.cac2);
        cac3=findViewById(R.id.cac3);
        cac4=findViewById(R.id.cac4);
        cac5=findViewById(R.id.cac5);
        rgc1=findViewById(R.id.rgc1);
        rgc2=findViewById(R.id.rgc2);
        rgc3=findViewById(R.id.rgc3);
        rgc4=findViewById(R.id.rgc4);
        rgc5=findViewById(R.id.rgc5);
        tvc3=findViewById(R.id.tvc3);
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score=0;
                int radioidc1=rgc1.getCheckedRadioButtonId();
                if (radioidc1==R.id.rbc2){
                    score++;
                    RadioButton radioButtonc1=findViewById(R.id.rbc2);
                }
                int radioidc2=rgc2.getCheckedRadioButtonId();
                if (radioidc2==R.id.rbc6){
                    score++;
                }
                int radioidc3=rgc3.getCheckedRadioButtonId();
                if (radioidc3==R.id.rbc10){
                    score++;
                }
                int radioidc4=rgc4.getCheckedRadioButtonId();
                if (radioidc4==R.id.rbc16){
                    score++;
                }
                int radioidc5=rgc5.getCheckedRadioButtonId();
                if (radioidc5==R.id.rbc20){
                    score++;
                }
                tvc3.setText("Your Score:"+score);
                cac1.setText("Correct Answer : 786 bytes");
                cac2.setText("Correct Answer : 5 and 1000");
                cac3.setText("Correct Answer : 8 MB, 116 GB and 2 TB");
                cac4.setText("Correct Answer : 256");
                cac5.setText("Correct Answer : 4000 cylinders, 2 milliseconds, 2.5 KB");
                if (score==5) {
                    Intent intent = new Intent(Quiz_c.this, FinalActivity.class);
                    intent.putExtra("Course Name", "Database Management System");
                    startActivity(intent);
                }
            }
        });

    }
}