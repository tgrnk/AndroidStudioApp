package com.tigrenok.helloapp.lab_1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.tigrenok.helloapp.R;

public class lab_1_2_MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // загрузка интерфейса из файла activity_main.xml
        setContentView(R.layout.lab_1_2_second_layot);

        // получаем элемент textView
        TextView textView = findViewById(R.id.header);
        // переустанавливаем у него текст
        textView.setText("Hello from Java!");
    }
}