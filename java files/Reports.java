package com.example.sunitaroutine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reports extends AppCompatActivity {

    private Button August22;
    private Button July22;
    private Button June22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reports);
        August22 = findViewById(R.id.raug22);
        July22 = findViewById(R.id.rjul22);
        June22 = findViewById(R.id.rjun22);
        August22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRaug22();
            }
        });
        July22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openRjul22();

            }
        });
        June22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRjun22();
            }
        });
    }
    public void openRaug22()
    {
        Intent intent=new Intent(this, August2022.class);
        startActivity(intent);
    }
    public void openRjul22()
    {
        Intent intent=new Intent(this, July2022.class);
        startActivity(intent);
    }
    public void openRjun22()
    {
        Intent intent=new Intent(this, June2022.class);
        startActivity(intent);
    }
}