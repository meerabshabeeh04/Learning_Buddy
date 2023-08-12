package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learningbuddy.R;

public class coursea extends AppCompatActivity {

    String[] courses={"Lecture 1:Analysis for NTA UGC NET","Lecture 2:What is Artificial Intelligence?","Lecture 3:State Space Search","Lecture 4:Uninformed VS Informed Search","Lecture 5:Breadth First Search","Lecture 6:Bidirectional Search","Lecture 7:Heuristic","Quiz"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coursea);
        listView=(ListView) findViewById(R.id.listView1);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, R.layout.listview,R.id.tv,courses);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=uB3i-qV6VdM&list=PLxCzCOWd7aiHGhOHV-nwb0HR5US5GFKFI&index=1"));
                    startActivity(intent1);
                }else if (position==1){
                    Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=s-s9ilkMVj8&list=PLxCzCOWd7aiHGhOHV-nwb0HR5US5GFKFI&index=2"));
                    startActivity(intent2);
                }else if (position==2){
                    Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=E5jVBqe59EE&list=PLxCzCOWd7aiHGhOHV-nwb0HR5US5GFKFI&index=3"));
                    startActivity(intent3);
                }else if (position==3){
                    Intent intent4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=gZpUcsB9TFc&list=PLxCzCOWd7aiHGhOHV-nwb0HR5US5GFKFI&index=4"));
                    startActivity(intent4);
                }else if (position==4){
                    Intent intent5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=qul0f79gxGs&list=PLxCzCOWd7aiHGhOHV-nwb0HR5US5GFKFI&index=5"));
                    startActivity(intent5);
                }else if (position==5){
                    Intent intent6=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=rEema9uQ02c&list=PLxCzCOWd7aiHGhOHV-nwb0HR5US5GFKFI&index=7"));
                    startActivity(intent6);
                }else if (position==6){
                    Intent intent7=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=5F9YzkpnaRw&list=PLxCzCOWd7aiHGhOHV-nwb0HR5US5GFKFI&index=9"));
                    startActivity(intent7);
                }else if (position==7){
                        Intent intent8=new Intent(coursea.this,Quiz_a.class);
                        startActivity(intent8);
                }
            };
        });
    }
}