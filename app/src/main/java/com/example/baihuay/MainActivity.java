package com.example.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Huay h = new Huay();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt2rd = (Button) findViewById(R.id.buttonRD2);
        bt2rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Huay.class);
                intent.putExtra("id","randomDigits2");
                startActivity(intent);
            }
        });

        Button bt3rd = (Button) findViewById(R.id.buttonRD3);
        bt3rd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Huay.class);
                intent.putExtra("id","randomDigits3");
                startActivity(intent);
            }
        });
    }
}
