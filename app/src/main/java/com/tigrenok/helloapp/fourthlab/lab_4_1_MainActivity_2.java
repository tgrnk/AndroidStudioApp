package com.tigrenok.helloapp.fourthlab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

import com.tigrenok.helloapp.R;


public class lab_4_1_MainActivity_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_4_1_activity_main_2);
        TextView timeTextView = findViewById(R.id.timeTextView);
        TimePicker timePicker = findViewById(R.id.timePicker);
        timePicker.setOnTimeChangedListener
                (new TimePicker.OnTimeChangedListener() {
                    @Override
                    public void onTimeChanged(TimePicker view, int
                            hourOfDay, int minute)
                    {
                        timeTextView.setText("Время: " + hourOfDay + ":" + minute);
                        // или так
                        // timeTextView.setText("Время: " + view.getHour() + ":" +
                        //view.getMinute());
                    }
                });
    }
}