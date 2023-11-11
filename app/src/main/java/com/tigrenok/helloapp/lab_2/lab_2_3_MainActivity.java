package com.tigrenok.helloapp.lab_2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.tigrenok.helloapp.R;

public class lab_2_3_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // загрузка интерфейса из файла activity_main.xml
        setContentView(R.layout.lab_2_3_activity);
    }
}

//    int clicks = 0;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.t2_lab_3_activity_main);
//        View plusButtonView = findViewById(R.id.plus_button);
//        View minusButtonView = findViewById(R.id.minus_button);
//        TextView clicksText = findViewById(R.id.clicksText);
//        Button plusButton =
//                plusButtonView.findViewById(R.id.clickBtn);
//        Button minusButton =
//                minusButtonView.findViewById(R.id.clickBtn);
//        plusButton.setText("+");
//        minusButton.setText("-");
//        plusButton.setOnClickListener(v -> {
//            clicks++;
//            clicksText.setText(clicks + " Clicks");
//        });
//        minusButton.setOnClickListener(v -> {
//            clicks--;
//            clicksText.setText(clicks + " Clicks");
//        });


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // загрузка интерфейса из файла activity_main.xml
//        setContentView(R.layout.t2_lab_3_activity);
