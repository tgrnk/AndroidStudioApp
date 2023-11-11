package com.tigrenok.helloapp.lab_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.tigrenok.helloapp.R;


public class lab_3_3_MainActivity_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_3_3_toggle_btn);
    }

    public void onToggleClicked(View view) {

        // включена ли кнопка
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {
            // действия если включена
            Toast.makeText(this, "Свет включен",
                    Toast.LENGTH_LONG).show();
        } else {
            // действия, если выключена
            Toast.makeText(this, "Свет выключен!",
                    Toast.LENGTH_LONG).show();
        }
    }
}


//    public void onCheckboxClicked(View view) {
//        // Получаем флажок
//        CheckBox checkBox = (CheckBox) view;
//        TextView selection = findViewById(R.id.selection);
//        // Получаем, отмечен ли данный флажок
//        if(checkBox.isChecked()) {
//            selection.setText("Включено");
//            checkBox.setText("Выключить");
//        }
//        else {
//            selection.setText("Выключено");
//            checkBox.setText("Включить");
//        }
//    }
