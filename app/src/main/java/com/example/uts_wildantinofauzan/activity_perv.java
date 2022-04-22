package com.example.uts_wildantinofauzan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_perv extends AppCompatActivity {

    public static ArrayList<Shape> shapeList = new ArrayList<Shape>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perv);

        setupData();
        setUpList();
        setUpOnclickListener();
    }

    private void setupData()
    {
        Shape bmw = new Shape("0", "BMW M3", R.drawable.bmw);
        shapeList.add(bmw);

        Shape buggati = new Shape("1","Lamborghini Buggati", R.drawable.buggati);
        shapeList.add(buggati);

        Shape ferrari = new Shape("2","Ferrari", R.drawable.ferrari);
        shapeList.add(ferrari);

        Shape supra = new Shape("3","Totota Supra", R.drawable.supra);
        shapeList.add(supra);

        Shape tesla = new Shape("4","Tesla", R.drawable.tesla);
        shapeList.add(tesla);

    }

    private void setUpList()
    {
        listView = (ListView) findViewById(R.id.shapesListView);

        activity_perv_adapter adapter = new activity_perv_adapter(getApplicationContext(), 0, shapeList);
        listView.setAdapter(adapter);
    }

    private void setUpOnclickListener()
    {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Shape selectShape = (Shape) (listView.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), activity_perv_detail.class);
                showDetail.putExtra("id",selectShape.getId());
                startActivity(showDetail);
            }
        });

    }
}