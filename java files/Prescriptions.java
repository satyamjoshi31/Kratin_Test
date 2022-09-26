package com.example.sunitaroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Prescriptions extends AppCompatActivity {

    private Button paug22;
    private Button pjul22;
    private Button pjun22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prescriptions);
        paug22 = findViewById(R.id.paug22);
        paug22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPres1();
            }
        });
        pjul22 = findViewById(R.id.pjul22);
        pjul22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPres2();
            }
        });
        pjun22 = findViewById(R.id.pjun22);
        pjun22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPres3();
            }
        });
    }
    public void openPres1()
    {
        Intent intent=new Intent(this, pres1.class);
        startActivity(intent);
    }
    public void openPres2()
    {
        Intent intent=new Intent(this, pres2.class);
        startActivity(intent);
    }
    public void openPres3()
    {
        Intent intent=new Intent(this, pres3.class);
        startActivity(intent);
    }
}