package com.example.baihuay;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Random;

public class Huay extends AppCompatActivity{

    String[] number = {"0","1","2","3","4","5","6","7","8","9"};
    Random rd = new Random();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huay2);

        Intent intent = getIntent();
        String ID = intent.getStringExtra("id");

        if (ID.equals("randomDigits2")) {
            getRandomTwoDigits();
        } else if (ID.equals("randomDigits3")) {
            getRandomThreeDigits();
        }
    }

    public String randomProcess() {
        int rdp = rd.nextInt(number.length);
        String rdp2 = number[rdp];
        return rdp2;
    }

    void getRandomTwoDigits() {
        TextView tv = (TextView) findViewById(R.id.tvDigits);
        tv.setText("เลขท้าย 2 ตัว");
        String rd1 = randomProcess();
        String rd2 = randomProcess();
        TextView tv2 = (TextView)findViewById(R.id.showDigits);
        tv2.setText(rd1+""+rd2);
    }

    void getRandomThreeDigits() {
        TextView tv = (TextView) findViewById(R.id.tvDigits);
        tv.setText("เลขท้าย 3 ตัว");
        String rd1 = randomProcess();
        String rd2 = randomProcess();
        String rd3 = randomProcess();
        TextView tv2 = (TextView)findViewById(R.id.showDigits);
        tv2.setText(rd1+""+rd2+""+3);
    }
}
