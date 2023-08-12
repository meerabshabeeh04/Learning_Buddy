package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Quiz_d extends AppCompatActivity {
    Button buttond;
    TextView cad1,cad2,cad3,cad4,cad5,tvd3;
    RadioGroup rgd1,rgd2,rgd3,rgd4,rgd5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_d);
        buttond=findViewById(R.id.btnd5);
        cad1=findViewById(R.id.cad1);
        cad2=findViewById(R.id.cad2);
        cad3=findViewById(R.id.cad3);
        cad4=findViewById(R.id.cad4);
        cad5=findViewById(R.id.cad5);
        rgd1=findViewById(R.id.rgd1);
        rgd2=findViewById(R.id.rgd2);
        rgd3=findViewById(R.id.rgd3);
        rgd4=findViewById(R.id.rgd4);
        rgd5=findViewById(R.id.rgd5);
        tvd3=findViewById(R.id.tvd3);
        buttond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int score=0;
                int radioidd1=rgd1.getCheckedRadioButtonId();
                if (radioidd1==R.id.rbd2){
                    score++;
                    RadioButton radioButtond1=findViewById(R.id.rbd2);
                }
                int radioidd2=rgd2.getCheckedRadioButtonId();
                if (radioidd2==R.id.rbd6){
                    score++;
                }
                int radioidd3=rgd3.getCheckedRadioButtonId();
                if (radioidd3==R.id.rbd10){
                    score++;
                }
                int radioidd4=rgd4.getCheckedRadioButtonId();
                if (radioidd4==R.id.rbd16){
                    score++;
                }
                int radioidd5=rgd5.getCheckedRadioButtonId();
                if (radioidd5==R.id.rbd20){
                    score++;
                }
                tvd3.setText("Your Score:"+score);
                cad1.setText("Correct Answer : network of virtual objects");
                cad2.setText("Correct Answer : John Wright");
                cad3.setText("Correct Answer : 1997");
                cad4.setText("Correct Answer : Tablet");
                cad5.setText("Correct Answer : IoT devices are completely safe");
                if (score==5) {
                    Intent intent = new Intent(Quiz_d.this, FinalActivity.class);
                    intent.putExtra("Course Name", "Internet Of Things");
                    startActivity(intent);
                }
            }
        });
    }
}