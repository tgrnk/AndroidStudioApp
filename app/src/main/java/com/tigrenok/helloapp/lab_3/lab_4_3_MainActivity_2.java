package com.tigrenok.helloapp.lab_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.tigrenok.helloapp.R;

public class lab_4_3_MainActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_4_3_activity_main_2);
    }

    public void onClick(View v) {
        EditText nameText = findViewById(R.id.name);
        EditText companyText = findViewById(R.id.company);
        EditText ageText = findViewById(R.id.age);
        String name = nameText.getText().toString();
        String company = companyText.getText().toString();
        int age = Integer.parseInt(ageText.getText().toString());
        lab_4_3_Users user = new lab_4_3_Users(name, company, age);
        Intent intent = new Intent(this, lab_4_3_MainActivity_2.class);
        intent.putExtra(lab_4_3_Users.class.getSimpleName(), user);
        startActivity(intent);
    }
}