package com.tigrenok.helloapp.lab_3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class lab_4_3_SecondActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_second);
        TextView textView = new TextView(this);
        textView.setTextSize(26);
        textView.setPadding(16, 16, 16, 16);
        Bundle arguments = getIntent().getExtras();
        lab_4_3_Users user;
        if(arguments!=null){
            user = (lab_4_3_Users) arguments.getSerializable
                    (lab_4_3_Users.class.getSimpleName());
            textView.setText("Name: " + user.getName() +
                    "\nCompany: " + user.getCompany() +
                    "\nAge: " + String.valueOf(user.getAge()));
        }
        setContentView(textView);
    }
}