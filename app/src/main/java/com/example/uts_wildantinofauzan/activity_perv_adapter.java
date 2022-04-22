package com.example.uts_wildantinofauzan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class activity_perv_adapter extends ArrayAdapter<Shape>
{

    public activity_perv_adapter(Context context, int resource, List<Shape> shapeList)
    {
        super(context,resource,shapeList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Shape shape = getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_perv_cell, parent, false);
        }
        TextView tv = (TextView) convertView.findViewById(R.id.shapeName);
        ImageView iv = (ImageView) convertView.findViewById(R.id.shapeImage);

        tv.setText(shape.getName());
        iv.setImageResource(shape.getImage());


        return convertView;
    }
}