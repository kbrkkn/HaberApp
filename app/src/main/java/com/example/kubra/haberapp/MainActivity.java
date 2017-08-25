package com.example.kubra.haberapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
ArrayList<VeriModeli> haberlist;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.listView);
        haberlist=new ArrayList<>();
        haberlist.add(new VeriModeli("Sabah",R.drawable.sabah,"http://www.sabah.com.tr"));
        haberlist.add(new VeriModeli("Cumhuriyet",R.drawable.cumhuriyet,"http://www.cumhuriyet.com.tr"));
        haberlist.add(new VeriModeli("Milliyet",R.drawable.milliyet,"http://www.milliyet.com.tr"));
        haberlist.add(new VeriModeli("Posta",R.drawable.posta,"http://www.posta.com.tr"));
        haberlist.add(new VeriModeli("Yurt",R.drawable.yurt,"http://www.yurt.com.tr"));
CustomAdapter adapter=new CustomAdapter(this,haberlist);
        listView.setAdapter(adapter);


       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent=new Intent(getApplicationContext(),WebActivity.class);
               intent.putExtra("link",haberlist.get(position).getHaberLink());
               startActivity(intent);
           }
       });
    }
}
