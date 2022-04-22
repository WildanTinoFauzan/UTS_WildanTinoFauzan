package com.example.uts_wildantinofauzan;

import androidx.annotation.NonNull;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class activity_pervi_listview_cell extends ArrayAdapter<Shape> {


    public activity_pervi_listview_cell(Context context, int resource, ArrayList<Shape> shappeList) {
        super(context, resource, shappeList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Shape shape = getItem(position);

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_pervi_listview_cell, parent, false);
        }

        TextView tv = convertView.findViewById(R.id.shapeName);
        ImageView iv = convertView.findViewById(R.id.shapeImage);

        tv.setText(shape.getName());
        iv.setImageResource(shape.getImage());

        return convertView;
    }
}