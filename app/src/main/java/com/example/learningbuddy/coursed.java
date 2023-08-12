package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class coursed extends AppCompatActivity {

    String[] courses = {"Lecture 1:Introduction to IOT","Lecture 2:Communication Models","Lecture 3:Rest VS Web Socket","Lecture 4:Sensing","Lecture 5:Actuation","Lecture 6:Message Queue Telemetry Transport MQTT","Lecture 7:Zigbee","Quiz"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursed);
        listView = findViewById(R.id.listView4);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, R.layout.listview, R.id.tv,courses);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=APH6Nrar27w&list=PLYwpaL_SFmcB8fDd64B8SkJiPpEIzpCzC"));
                    startActivity(intent1);
                }else if (position==1){
                    Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=lVh9GUt69Ms&list=PLYwpaL_SFmcB8fDd64B8SkJiPpEIzpCzC&index=2"));
                    startActivity(intent2);
                }else if (position==2){
                    Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=u_0Vzmj1Bxo&list=PLYwpaL_SFmcB8fDd64B8SkJiPpEIzpCzC&index=6"));
                    startActivity(intent3);
                }else if (position==3){
                    Intent intent4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=l8LyDfOPtRA&list=PLYwpaL_SFmcB8fDd64B8SkJiPpEIzpCzC&index=12"));
                    startActivity(intent4);
                }else if (position==4){
                    Intent intent5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=omyibPdeU0k&list=PLYwpaL_SFmcB8fDd64B8SkJiPpEIzpCzC&index=14"));
                    startActivity(intent5);
                }else if (position==5){
                    Intent intent6=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=9eXLa1kurEQ&list=PLYwpaL_SFmcB8fDd64B8SkJiPpEIzpCzC&index=16"));
                    startActivity(intent6);
                }else if (position==6){
                    Intent intent7=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=_dl8oTiL6Wg&list=PLYwpaL_SFmcB8fDd64B8SkJiPpEIzpCzC&index=19"));
                    startActivity(intent7);
                }else if (position==7){
                    Intent intent8=new Intent(coursed.this,Quiz_d.class);
                    startActivity(intent8);
                }
            };
        });
    }
}