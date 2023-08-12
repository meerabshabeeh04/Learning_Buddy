package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class coursec extends AppCompatActivity {

    String[] courses = {"Lecture 1:Introduction to DBMS","Lecture 2:2 tier and 3 tier Architecture","Lecture 3:What is Schema?","Lecture 4:Three Schema Architecture","Lecture 5:What is Data Independence?","Lecture 6:Candidate Key and Primary Key","Lecture 7:Foreign Key in DBMS","Quiz"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursec);
        listView = findViewById(R.id.listView3);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, R.layout.listview, R.id.tv,courses);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=3EJlovevfcA&list=PLxCzCOWd7aiFAN6I8CuViBuCdJgiOkT2Y&index=2"));
                    startActivity(intent1);
                }else if (position==1){
                    Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=VyvTabQHevw&list=PLxCzCOWd7aiFAN6I8CuViBuCdJgiOkT2Y&index=4"));
                    startActivity(intent2);
                }else if (position==2){
                    Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=pDX4NR4eY3A&list=PLxCzCOWd7aiFAN6I8CuViBuCdJgiOkT2Y&index=5"));
                    startActivity(intent3);
                }else if (position==3){
                    Intent intent4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=5fs1ldO6B5c&list=PLxCzCOWd7aiFAN6I8CuViBuCdJgiOkT2Y&index=6"));
                    startActivity(intent4);
                }else if (position==4){
                    Intent intent5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=upUSGUSK5k0&list=PLxCzCOWd7aiFAN6I8CuViBuCdJgiOkT2Y&index=7"));
                    startActivity(intent5);
                }else if (position==5){
                    Intent intent6=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=mMxjKFiIKxs&list=PLxCzCOWd7aiFAN6I8CuViBuCdJgiOkT2Y&index=8"));
                    startActivity(intent6);
                }else if (position==6){
                    Intent intent7=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=UyqpQ3D2yCw&list=PLxCzCOWd7aiFAN6I8CuViBuCdJgiOkT2Y&index=10"));
                    startActivity(intent7);
                }else if (position==7){
                    Intent intent8=new Intent(coursec.this,Quiz_c.class);
                    startActivity(intent8);
                }
            };
        });
    }
}