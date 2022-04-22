package com.example.uts_wildantinofauzan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activity_periii extends AppCompatActivity {
    Button btn_login, btn_tutup;
    String[][] data = {{"Wildan", "Wildan", "Administrator"}, {"Wildan", "Wildan", "User1"}};
    EditText user, pass;
    String nama, sandi;
    int find = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periii);

        user = findViewById(R.id.username);
        pass = findViewById(R.id.password);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama = user.getText().toString();
                Intent intent = new Intent(view.getContext(), activity_periii_login.class);
                intent.putExtra("nama", nama);
                startActivity(intent);
            }
        });

        btn_tutup = findViewById(R.id.btn_tutup);
        btn_tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}