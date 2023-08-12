package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class courseb extends AppCompatActivity {

    String[] courses = {"Lecture 1:Features and labels in Machine Learning","Lecture 2:Data Collection for Machine Learning","Lecture 3:Supervised and Unsupervised Learning","Lecture 4:Training and Test data in Machine Learning","Lecture 5:Simple Linear Regression","Lecture 6:Multiple Regerssion","Lecture 7:Loss Functions and Gradient Descent","Quiz"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courseb);
        listView = findViewById(R.id.listView2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, R.layout.listview, R.id.tv,courses);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=6pUkiLnpYC4&list=PLu0W_9lII9ai6fAMHp-acBmJONT7Y4BSG&index=3"));
                    startActivity(intent1);
                }else if (position==1){
                    Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=DA0dIVeXpzQ&list=PLu0W_9lII9ai6fAMHp-acBmJONT7Y4BSG&index=4"));
                    startActivity(intent2);
                }else if (position==2){
                    Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=SJRojOq5P_4&list=PLu0W_9lII9ai6fAMHp-acBmJONT7Y4BSG&index=5"));
                    startActivity(intent3);
                }else if (position==3){
                    Intent intent4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=sAabARyfYZg&list=PLu0W_9lII9ai6fAMHp-acBmJONT7Y4BSG&index=7"));
                    startActivity(intent4);
                }else if (position==4){
                    Intent intent5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=Ni5QwU-xaUs&list=PLu0W_9lII9ai6fAMHp-acBmJONT7Y4BSG&index=8"));
                    startActivity(intent5);
                }else if (position==5){
                    Intent intent6=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=0Kha6KIto28&list=PLu0W_9lII9ai6fAMHp-acBmJONT7Y4BSG&index=9"));
                    startActivity(intent6);
                }else if (position==6){
                    Intent intent7=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=BZ10SGWtU-s&list=PLu0W_9lII9ai6fAMHp-acBmJONT7Y4BSG&index=12"));
                    startActivity(intent7);
                }else if (position==7){
                    Intent intent8=new Intent(courseb.this,Quiz_b.class);
                    startActivity(intent8);
                }
            };
        });
    }
}