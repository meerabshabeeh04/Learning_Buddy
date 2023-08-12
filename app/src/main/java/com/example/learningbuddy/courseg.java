package com.example.learningbuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class courseg extends AppCompatActivity {

    String[] courses = {"Lecture 1:Introduction to Web Development","Lecture 2:Media Elements","Lecture 3:Properties in CSS","Lecture 4:Box Model","Lecture 5:Cascading,Specifity and Inheritance","Lecture 6:Styling Forms in CSS","Lecture 7:Responsiveness","Quiz"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courseg);
        listView = findViewById(R.id.listView7);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, R.layout.listview, R.id.tv,courses);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Intent intent1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=l1EssrLxt7E&list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n"));
                    startActivity(intent1);
                }else if (position==1){
                    Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=jRAZlTEZi9I&list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n&index=4"));
                    startActivity(intent2);
                }else if (position==2){
                    Intent intent3=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=4nC4VXHlys8&list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n&index=7"));
                    startActivity(intent3);
                }else if (position==3){
                    Intent intent4=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=C01LeeMhwHc&list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n&index=8"));
                    startActivity(intent4);
                }else if (position==4){
                    Intent intent5=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=wKPlQkOdpFQ&list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n&index=9"));
                    startActivity(intent5);
                }else if (position==5){
                    Intent intent6=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=6Cpd63_WXdI&list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n&index=10"));
                    startActivity(intent6);
                }else if (position==6){
                    Intent intent7=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=p870o46o1bM&list=PLfqMhTWNBTe3H6c9OGXb5_6wcc1Mca52n&index=13"));
                    startActivity(intent7);
                }else if (position==7){
                    Intent intent8=new Intent(courseg.this,Quiz_g.class);
                    startActivity(intent8);
                }
            };
        });
    }
}