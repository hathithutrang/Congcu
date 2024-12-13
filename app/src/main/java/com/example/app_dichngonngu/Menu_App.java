package com.example.app_dichngonngu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu_App extends AppCompatActivity {
    Button btn_dichtimkiemvahinhanh, btndichbanghinhanh, btndichbangamthanh, btndichbangfile, btnlichsu, btntimkiemtuvung, btntimkiembangfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu_app);

        btn_dichtimkiemvahinhanh = findViewById(R.id.btn_dichtimkiemvahinhanh);
        btn_dichtimkiemvahinhanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_App.this,Dich_Ngon_Ngu.class);
                startActivity(intent);
            }
        });
        btndichbanghinhanh = findViewById(R.id.btndichbanghinhanh);
        btndichbanghinhanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_App.this, activity_dich_hinh_anh.class);
                startActivity(intent);
            }
        });
        btndichbangamthanh = findViewById(R.id.btndichbangamthanh);
        btndichbangamthanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_App.this,DichBangAmThanh.class);
                startActivity(intent);
            }
        });
        btndichbangfile = findViewById(R.id.btndichbangfile);
        btndichbangfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_App.this, activity_Dich_Bang_File.class);
                startActivity(intent);
            }
        });
        btnlichsu = findViewById(R.id.btnlichsu);
        btnlichsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_App.this, activity_lich_su.class);
                startActivity(intent);
            }
        });
        btntimkiemtuvung = findViewById(R.id.btntimkiemtuvung);
        btntimkiemtuvung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_App.this, activity_tim_kiem_bang_tu_vung.class);
                startActivity(intent);
            }
        });
        btntimkiembangfile = findViewById(R.id.btntimkiembangfile);
        btntimkiembangfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Menu_App.this, activity_tim_kiem_bang_file.class);
                startActivity(intent);
            }
        });
    }
}