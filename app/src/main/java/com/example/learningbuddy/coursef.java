package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class coursef extends AppCompatActivity {

    String[] courses = {"Lecture 1:Introduction to Game Development","Lecture 2:Views and Unity3D Layout","Lecture 3:Navigating in Unity3D","Lecture 4:Scripting in Unity3D","Lecture 5:C# Variables","Lecture 6:Data Types in C#","Lecture 7:Conditional Statements in C#","Quiz"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursef);
        listView = findViewById(R.id.listView6);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, R.layout.listview, R.id.tv,courses);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=oriezhSIIY4&list=PLBh8phtAyHPUY9fqgs1w6aHJALJ3_fMSc&index=2"));
                    startActivity(intent1);
                }else if (position==1){
                    Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=-dqPT4X4tKE&list=PLBh8phtAyHPUY9fqgs1w6aHJALJ3_fMSc&index=6"));
                    startActivity(intent2);
                }else if (position==2){
                    Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=iEHgGXx_hWY&list=PLBh8phtAyHPUY9fqgs1w6aHJALJ3_fMSc&index=11"));
                    startActivity(intent3);
                }else if (position==3){
                    Intent intent4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=8yxYPFll6a4&list=PLBh8phtAyHPUY9fqgs1w6aHJALJ3_fMSc&index=12"));
                    startActivity(intent4);
                }else if (position==4){
                    Intent intent5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=YaGwZ2_XX6o&list=PLBh8phtAyHPUY9fqgs1w6aHJALJ3_fMSc&index=15"));
                    startActivity(intent5);
                }else if (position==5){
                    Intent intent6=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=22nNr4XZ1Eo&list=PLBh8phtAyHPUY9fqgs1w6aHJALJ3_fMSc&index=16"));
                    startActivity(intent6);
                }else if (position==6){
                    Intent intent7=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=KjC-dDGTrD8&list=PLBh8phtAyHPUY9fqgs1w6aHJALJ3_fMSc&index=17"));
                    startActivity(intent7);
                }else if (position==7){
                    Intent intent8=new Intent(coursef.this,Quiz_f.class);
                    startActivity(intent8);
                }
            };
        });
    }
}