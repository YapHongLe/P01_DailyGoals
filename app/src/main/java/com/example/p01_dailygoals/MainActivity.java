package com.example.p01_dailygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOK = (Button) findViewById(R.id.buttonOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioGroup rgMaterial = (RadioGroup) findViewById(R.id.radioMaterial);
                RadioGroup rgArrive = (RadioGroup) findViewById(R.id.radioArrive);
                RadioGroup rgAttempt = (RadioGroup) findViewById(R.id.radioAttempt);
                EditText etReflection = (EditText) findViewById(R.id.editTextReflection);

                int selectedMaterial = rgMaterial.getCheckedRadioButtonId();
                int selectedArrive = rgArrive.getCheckedRadioButtonId();
                int selectedAttempt = rgAttempt.getCheckedRadioButtonId();


                RadioButton rbMaterial = (RadioButton) findViewById(selectedMaterial);
                RadioButton rbArrive = (RadioButton) findViewById(selectedArrive);
                RadioButton rbAttempt = (RadioButton) findViewById(selectedAttempt);

                String[] info = {rbMaterial.getText().toString(),rbArrive.getText().toString(),rbAttempt.getText().toString()
                        , etReflection.getText().toString()};

                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });
    }
}
