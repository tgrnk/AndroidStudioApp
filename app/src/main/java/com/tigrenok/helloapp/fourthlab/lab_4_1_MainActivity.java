package com.tigrenok.helloapp.fourthlab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;

import com.tigrenok.helloapp.R;

public class lab_4_1_MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_4_1_activity_main);
        TextView dateTextView = findViewById(R.id.dateTextView);
        DatePicker datePicker = this.findViewById(R.id.datePicker);
        // Месяц начиная с нуля. Для отображения добавляем 1.
        datePicker.init(2020, 02, 01, new
                DatePicker.OnDateChangedListener() {
                    @Override
                    public void onDateChanged(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {
                        // Отсчет месяцев начинается с нуля. Для отображения добавляем 1.
                        dateTextView.setText("Дата: " + (view.getDayOfMonth() + "/" +
                                (view.getMonth() + 1)) + "/" + view.getYear());

                        // альтернативная запись
                        // dateTextView.setText("Дата: " + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                    }
                });
    }
}