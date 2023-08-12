package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class coursee extends AppCompatActivity {

    String[] courses = {"Lecture 1:Introduction to Cyber Security","Lecture 2:Malware","Lecture 3:Social Engineering","Lecture 4:Attack with Physical Access","Lecture 5:Networking","Lecture 6:Network Attack","Lecture 7:Web Hacking","Quiz"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursee);
        listView = findViewById(R.id.listView5);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, R.layout.listview, R.id.tv,courses);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=0LagbZ3zj1k&list=PLKJfBg0XdWkevCEJ64RK11LylBNX2-zbk&index=2"));
                    startActivity(intent1);
                }else if (position==1){
                    Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=DmJHaasuIBc&list=PLKJfBg0XdWkevCEJ64RK11LylBNX2-zbk&index=6"));
                    startActivity(intent2);
                }else if (position==2){
                    Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=z1tIXRRmNOs&list=PLKJfBg0XdWkevCEJ64RK11LylBNX2-zbk&index=8"));
                    startActivity(intent3);
                }else if (position==3){
                    Intent intent4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=vZHqx7eTYRc&list=PLKJfBg0XdWkevCEJ64RK11LylBNX2-zbk&index=12"));
                    startActivity(intent4);
                }else if (position==4){
                    Intent intent5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=nowf1u731QM&list=PLKJfBg0XdWkevCEJ64RK11LylBNX2-zbk&index=14"));
                    startActivity(intent5);
                }else if (position==5){
                    Intent intent6=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=ocS0UWe0M-A&list=PLKJfBg0XdWkevCEJ64RK11LylBNX2-zbk&index=15"));
                    startActivity(intent6);
                }else if (position==6){
                    Intent intent7=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=9tgtLgPkdxU&list=PLKJfBg0XdWkevCEJ64RK11LylBNX2-zbk&index=16"));
                    startActivity(intent7);
                }else if (position==7){
                    Intent intent8=new Intent(coursee.this,Quiz_e.class);
                    startActivity(intent8);
                }
            };
        });
    }
}