package com.tigrenok.helloapp.lab_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tigrenok.helloapp.R;

public class lab_2_2_MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // загрузка интерфейса из файла activity_main.xml
        setContentView(R.layout.lab_2_2_activity);
    }
}
