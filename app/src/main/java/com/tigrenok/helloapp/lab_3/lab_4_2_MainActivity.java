package com.tigrenok.helloapp.lab_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.tigrenok.helloapp.R;

public class lab_4_2_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_4_2_activity_main);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, lab_4_2_SecondActivity.class);
        startActivity(intent);
    }
}