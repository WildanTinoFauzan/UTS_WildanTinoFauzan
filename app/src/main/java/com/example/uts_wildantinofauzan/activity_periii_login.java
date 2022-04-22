package com.example.uts_wildantinofauzan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activity_periii_login extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periii_login);

        tv = findViewById(R.id.tvlogin);
        tv.setText(getIntent().getExtras().getString("nama"));
    }
}