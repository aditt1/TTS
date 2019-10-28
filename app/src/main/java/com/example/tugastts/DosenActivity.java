package com.example.tugastts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DosenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosen);

        ImageButton krsBtn = findViewById(R.id.btnDaftarKrs);
        ImageButton dataDiriBtn = findViewById(R.id.btnData);
        ImageButton dataKelasBtn = findViewById(R.id.btnLihat);

        krsBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this,ListKRSActivity.class);
                startActivity(i);
            }
        });

        dataDiriBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this,DataDosenActivity.class);
                startActivity(i);
            }
        });

        dataKelasBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(DosenActivity.this,LihatKelasActivity.class);
                startActivity(i);
            }
        });
    }
}
