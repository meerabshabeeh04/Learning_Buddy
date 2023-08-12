package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    Button button4;
    EditText edittext3;
    EditText edittext4;
    EditText edittext5;
    EditText edittext6;
    EditText edittext7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        button4=findViewById(R.id.btn4);
        edittext3=findViewById(R.id.et2);
        edittext4=findViewById(R.id.et3);
        edittext5=findViewById(R.id.eph);
        edittext6=findViewById(R.id.et4);
        edittext7=findViewById(R.id.ep2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edittext3.getText().toString())){
                    Toast.makeText(signup.this,"All fields must be filled to proceed", Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(edittext4.getText().toString())){
                    Toast.makeText(signup.this,"All fields must be filled to proceed",Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(edittext5.getText().toString())){
                    Toast.makeText(signup.this,"All fields must be filled to proceed",Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(edittext6.getText().toString())){
                    Toast.makeText(signup.this,"All fields must be filled to proceed",Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(edittext7.getText().toString())){
                    Toast.makeText(signup.this,"All fields must be filled to proceed",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent int4=new Intent(signup.this,courses.class);
                    startActivity(int4);
                }
            }
        });
    }
}