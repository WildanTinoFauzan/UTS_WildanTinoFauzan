package com.example.uts_wildantinofauzan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class activity_periv extends AppCompatActivity {

    private String[] items = {"Short", "Long"};
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periv);

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        spinner.setAdapter(adapter);

        Button btn1, btn2, btn3, btn4;
        btn1 = findViewById(R.id.btn_alert1);
        btn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alert1 = new AlertDialog.Builder(activity_periv.this).create();
                alert1.setTitle("Notification");
                alert1.setMessage("Wildan, kamu berhasil membuat alert!!");
                alert1.setIcon(R.mipmap.ic_launcher_round);
                alert1.setButton(Dialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Anda Menekan Tombol OK", Toast.LENGTH_SHORT).show();
                    }
                });
                alert1.show();
            }
        });

        btn2 = findViewById(R.id.btn_alert2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder alert2 = new AlertDialog.Builder(activity_periv.this);
                alert2.setTitle("Notifikasi 2");
                alert2.setMessage("Tampilan Alert 2");
                alert2.setIcon(R.mipmap.ic_launcher_round);
                alert2.setPositiveButton("Ya", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(getApplicationContext(), "Anda menekan tombol ya", Toast.LENGTH_SHORT).show();
                    }
                });
                alert2.setNegativeButton("Tidak", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(getApplicationContext(), "Anda menekan tombol Tidak", Toast.LENGTH_SHORT).show();
                        alert2.show();
                    }
                });
                alert2.show();
            }
        });

        btn3 = findViewById(R.id.btn_alert3);
        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog.Builder alert3 = new AlertDialog.Builder(activity_periv.this);
                alert3.setTitle("Notifikasi 3");
                alert3.setMessage("Tampilan Alert 3");
                alert3.setIcon(R.mipmap.ic_launcher_round);
                alert3.setPositiveButton("Ya", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(getApplicationContext(), "Anda menekan tombol ya", Toast.LENGTH_SHORT).show();
                    }
                });
                alert3.setNegativeButton("Tidak", new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText(getApplicationContext(), "Anda menekan tombol Tidak", Toast.LENGTH_SHORT).show();
                        alert3.show();
                    }
                });
                alert3.show();
            }
        });

        btn4 = findViewById(R.id.btn_toast);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (spinner.getSelectedItemPosition() == 0){
                    Toast.makeText(getApplicationContext(), "Toast Short", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Toast Long", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}