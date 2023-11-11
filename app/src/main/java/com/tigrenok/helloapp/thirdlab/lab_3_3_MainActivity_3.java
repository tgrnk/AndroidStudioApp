package com.tigrenok.helloapp.thirdlab;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.tigrenok.helloapp.R;

public class lab_3_3_MainActivity_3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_3_3_radio_btn);

        // Получаем объект RadioGroup
        RadioGroup radGrp = findViewById(R.id.radios);

        // Обработка переключения состояния переключателя
        radGrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup arg0, int id) {
                TextView selection = findViewById(R.id.selection);
                RadioButton javaRadioButton = findViewById(R.id.java);
                RadioButton kotlinRadioButton = findViewById(R.id.kotlin);

                if (id == javaRadioButton.getId()) {
                    selection.setText("Выбрана Java");
                } else if (id == kotlinRadioButton.getId()) {
                    selection.setText("Выбран Kotlin");
                }
            }
        });
    }
}
