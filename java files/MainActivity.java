package com.example.sunitaroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity
{
    private Button sos;
    private Button reports;
    private Button pres;
    private Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        reports = findViewById(R.id.reports);
        sos = findViewById(R.id.sos);
        pres = findViewById(R.id.pres);
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNext();
            }
        });
        pres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPres();
            }
        });

        sos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSos();
            }
        });
        reports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openReports();
            }
        });

    }
    public void openSos()
    {
        Intent intent=new Intent(this, SOS.class);
        startActivity(intent);
    }
    public void openReports()
    {
        Intent intent=new Intent(this, Reports.class);
        startActivity(intent);
    }
    public void openPres()
    {
        Intent intent=new Intent(this, Prescriptions.class);
        startActivity(intent);
    }
    public void openNext()
    {
        Intent intent=new Intent(this, Next.class);
        startActivity(intent);
    }


}