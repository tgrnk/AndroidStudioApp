package com.tigrenok.helloapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // получаем элемент textView
        //  TextView textView = findViewById(R.id.header);
        // переустанавливаем у него текст
        //textView.setText("Hello from Java!");
    }
}
