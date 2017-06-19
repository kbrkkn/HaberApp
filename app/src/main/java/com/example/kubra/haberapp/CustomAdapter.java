package com.example.kubra.haberapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kubra on 11.06.2017.
 */

public class CustomAdapter extends BaseAdapter {
    private LayoutInflater haberInflater;
    ArrayList<VeriModeli> haberList;

public CustomAdapter(Activity activity, ArrayList<VeriModeli> haberList){
    this.haberList=haberList;
    haberInflater= (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

}
    @Override
    public int getCount() {
        return haberList.size();
    }

    @Override
    public Object getItem(int position) {
        return haberList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View haberSatiri=haberInflater.inflate(R.layout.custom_satir,null);
        ImageView img= (ImageView) haberSatiri.findViewById(R.id.imageView);
        TextView textView= (TextView) haberSatiri.findViewById(R.id.haber);
        VeriModeli veriModeli=haberList.get(position);

textView.setText(veriModeli.getHaberSitesiAdi());
        img.setImageResource(veriModeli.getLogo());

        return haberSatiri;
    }
}
