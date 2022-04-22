package com.example.uts_wildantinofauzan;

import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class activity_pervi_listview extends Fragment {

    public activity_pervi_listview(){

    }

    public static ArrayList<Shape> shappeList = new ArrayList<Shape>();
    private ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.activity_pervi_listview, container, false);
        setupData();

        listView = v.findViewById(R.id.shapeListview);
        activity_pervi_listview_cell adapter = new activity_pervi_listview_cell(getContext(), 0, shappeList);
        listView.setAdapter(adapter);

        setupOnClickListener();
        return v;
    }

    public void setupData(){
        Shape indonesia = new Shape("0", "Indonesia Merdeka tahun 1945", R.drawable.indonesia);
        shappeList.add(indonesia);

        Shape malaysia = new Shape("1", "Malaysia Merdeka tahun 1967", R.drawable.malaysia);
        shappeList.add(malaysia);

        Shape vietnam = new Shape("2", "Vietnam Merdeka tahun 1995", R.drawable.vietnam);
        shappeList.add(vietnam);

        Shape thailand = new Shape("3", "Thailand Merdeka tahun 1967", R.drawable.thailand);
        shappeList.add(thailand);

        Shape myanmar = new Shape("4", "Myanmar Merdeka tahun 1997", R.drawable.myanmar);
        shappeList.add(myanmar);

    }

    private void setupOnClickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Shape selectShape = (Shape) listView.getItemAtPosition(i);
                Intent showDetail = new Intent(getContext(), activity_pervi_listview_detail.class);
                showDetail.putExtra("id", selectShape.getId());
                startActivity(showDetail);
            }
        });
    }
}