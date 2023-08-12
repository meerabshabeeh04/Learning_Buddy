package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button button3;
    EditText edittext1;
    EditText edittext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        button3=findViewById(R.id.btn3);
        edittext1=findViewById(R.id.et1);
        edittext2=findViewById(R.id.ep1);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(edittext1.getText().toString())){
                    Toast.makeText(login.this,"All fields must be filled to proceed",Toast.LENGTH_SHORT).show();
                }
                else if (TextUtils.isEmpty(edittext2.getText().toString())){
                    Toast.makeText(login.this,"All fields must be filled to proceed",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent int3=new Intent(login.this,courses.class);
                    startActivity(int3);
                }
            }
        });
    }
}