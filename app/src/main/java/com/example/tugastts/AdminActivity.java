package com.example.tugastts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);


        ImageButton dosenBtn = findViewById(R.id.btnDosen);
        ImageButton dataBtn = findViewById(R.id.btnData);
        ImageButton matkulBtn = findViewById(R.id.btnMatkul);
        ImageButton krsBtn = findViewById(R.id.btnKRS);
        ImageButton mhsBtn = findViewById(R.id.btnMhs);

        dosenBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this,ListDosenActivity.class);
                startActivity(i);
            }
        });

        dataBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this,DataDosenActivity.class);
                startActivity(i);
            }
        });

        matkulBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this,ListMatkulActivity.class);
                startActivity(i);
            }
        });

        krsBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this,ListKRSActivity.class);
                startActivity(i);
            }
        });

        mhsBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AdminActivity.this,ListMahasiswaActivity.class);
                startActivity(i);
            }
        });
    }
}
