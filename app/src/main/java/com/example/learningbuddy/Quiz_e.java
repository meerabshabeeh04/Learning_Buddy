package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz_e extends AppCompatActivity {
    Button buttone;
    TextView cae1,cae2,cae3,cae4,cae5,tve3;
    RadioGroup rge1,rge2,rge3,rge4,rge5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_e);
        buttone=findViewById(R.id.btne5);
        cae1=findViewById(R.id.cae1);
        cae2=findViewById(R.id.cae2);
        cae3=findViewById(R.id.cae3);
        cae4=findViewById(R.id.cae4);
        cae5=findViewById(R.id.cae5);
        rge1=findViewById(R.id.rge1);
        rge2=findViewById(R.id.rge2);
        rge3=findViewById(R.id.rge3);
        rge4=findViewById(R.id.rge4);
        rge5=findViewById(R.id.rge5);
        tve3=findViewById(R.id.tve3);
        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score=0;
                int radioide1=rge1.getCheckedRadioButtonId();
                if (radioide1==R.id.rbe2){
                    score++;
                    RadioButton radioButtone1=findViewById(R.id.rbe2);
                }
                int radioide2=rge2.getCheckedRadioButtonId();
                if (radioide2==R.id.rbe6){
                    score++;
                }
                int radioide3=rge3.getCheckedRadioButtonId();
                if (radioide3==R.id.rbe10){
                    score++;
                }
                int radioide4=rge4.getCheckedRadioButtonId();
                if (radioide4==R.id.rbe16){
                    score++;
                }
                int radioide5=rge5.getCheckedRadioButtonId();
                if (radioide5==R.id.rbe20){
                    score++;
                }
                tve3.setText("Your Score:"+score);
                cae1.setText("Correct Answer : Share passwords only with colleagues you trust.");
                cae2.setText("Correct Answer : IT specialists, because they are in the best position to know about and promote cybersecurity within a business.");
                cae3.setText("Correct Answer : Turn off the router’s remote management.");
                cae4.setText("Correct Answer : All of the above");
                cae5.setText("Correct Answer : You shouldn’t limit login attempts on key business devices.");
                if (score==5) {
                    Intent intent = new Intent(Quiz_e.this, FinalActivity.class);
                    intent.putExtra("Course Name", "Cyber Security");
                    startActivity(intent);
                }
            }
        });
    }
}