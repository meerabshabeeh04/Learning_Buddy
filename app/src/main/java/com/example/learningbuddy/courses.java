package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class courses extends AppCompatActivity {
    ImageButton imgbtn1,imgbtn2,imgbtn3, imgbtn4, imgbtn5 , imgbtn6,imgbtn7;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        imgbtn1 =(ImageButton) findViewById(R.id.imageButton1);
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inta= new Intent(courses.this,coursea.class);
                startActivity(inta);
            }
        });
        imgbtn2 =(ImageButton) findViewById(R.id.imageButton2);
        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intb= new Intent(courses.this,courseb.class);
                startActivity(intb);
            }
        });
        imgbtn3 =(ImageButton) findViewById(R.id.imageButton3);
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intc= new Intent(courses.this,coursec.class);
                startActivity(intc);
            }
        });
        imgbtn4 =(ImageButton) findViewById(R.id.imageButton4);
        imgbtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intd= new Intent(courses.this,coursed.class);
                startActivity(intd);
            }
        });
        imgbtn5 =(ImageButton) findViewById(R.id.imageButton5);
        imgbtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte= new Intent(courses.this,coursee.class);
                startActivity(inte);
            }
        });
        imgbtn6 =(ImageButton) findViewById(R.id.imageButton6);
        imgbtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intf= new Intent(courses.this,coursef.class);
                startActivity(intf);
            }
        });
        imgbtn7 =(ImageButton) findViewById(R.id.imageButton7);
        imgbtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intg= new Intent(courses.this,courseg.class);
                startActivity(intg);
            }
        });





    }
}