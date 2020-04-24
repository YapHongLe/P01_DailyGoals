package com.example.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
        String[] info = i.getStringArrayExtra("info");

        TextView tvMaterials = findViewById(R.id.tvMaterials);
        TextView tvArrive = findViewById(R.id.tvArrive);
        TextView tvAttempt = findViewById(R.id.tvAttempt);
        TextView tvReflection = findViewById(R.id.tvReflection);

        tvMaterials.setText("Read up on materials before class : " + info[0]);
        tvArrive.setText("Arrive on time so as not to miss important part of the lesson : " +info[1]);
        tvAttempt.setText("Attempt the problem myself : " + info[2]);
        tvReflection.setText("Reflection : " + info[3]);

    }
}
