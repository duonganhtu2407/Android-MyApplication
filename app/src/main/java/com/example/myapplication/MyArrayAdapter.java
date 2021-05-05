package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class MyArrayAdapter extends ArrayAdapter<NhanVien> {
    Activity context = null;
    ArrayList<NhanVien> myArray = null;
    int LayoutId;


    public MyArrayAdapter(Activity context, int textViewResourceId,
                          ArrayList<NhanVien> objects) {

        super(context, textViewResourceId, objects);
        this.context=context;
        this.LayoutId = textViewResourceId;
        this.myArray = objects;
    }
    public View getView(int position , View convertView, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        convertView = inflater.inflate(LayoutId,null);
        if(myArray.size() > 0  && position>=0){
            final TextView txtDisplay = (TextView) convertView.findViewById(R.id.tv_item);
            final NhanVien nv = myArray.get(position);
            txtDisplay.setText(nv.toString());
            final ImageView imgitem = convertView.findViewById(R.id.img_item);
            if(nv.isGender()){
                imgitem.setImageResource(R.drawable.girlicon);
            }
            else {
                imgitem.setImageResource(R.drawable.boyicon);
            }

        }
        return convertView;
    }
}
