package com.ivan.simpleandroidcalculator;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Calculator calculator;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();
        display = findViewById(R.id.resultTV);

        Button addBtn = findViewById(R.id.addBtn);
        Button minusBtn = findViewById(R.id.minusBtn);
        Button multiplyBtn = findViewById(R.id.multiplyBtn);
        Button divideBtn = findViewById(R.id.divideBtn);
        Button percentBtn = findViewById(R.id.percentBtn);
        Button plusMinusBtn = findViewById(R.id.plusMinusBtn);
        Button clearBtn = findViewById(R.id.clearBtn);
        Button equalsBtn = findViewById(R.id.equalsBtn);


    }
}