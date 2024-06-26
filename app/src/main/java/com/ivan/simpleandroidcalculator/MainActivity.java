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
    private String currentInput = "";
    private String operation = "";
    private double firstNumber = 0;

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
        Button decimalBtn = findViewById(R.id.decimalBtn);
        Button allClearBtn = findViewById(R.id.allClearBtn);

        Button zeroBtn = findViewById(R.id.zeroBtn);
        Button oneBtn = findViewById(R.id.oneBtn);
        Button twoBtn = findViewById(R.id.twoBtn);
        Button threeBtn = findViewById(R.id.threeBtn);
        Button fourBtn = findViewById(R.id.fourBtn);
        Button fiveBtn = findViewById(R.id.fiveBtn);
        Button sixBtn = findViewById(R.id.sixBtn);
        Button sevenBtn = findViewById(R.id.sevenBtn);
        Button eightBtn = findViewById(R.id.eightBtn);
        Button nineBtn = findViewById(R.id.nineBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentInput.isEmpty() && isNumeric(currentInput)) {
                    firstNumber = Double.parseDouble(currentInput);
                    operation = "+";
                    currentInput = "";
                }
            }
        });

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentInput.isEmpty() && isNumeric(currentInput)) {
                    firstNumber = Double.parseDouble(currentInput);
                    operation = "-";
                    currentInput = "";
                }
            }
        });

        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentInput.isEmpty() && isNumeric(currentInput)) {
                    firstNumber = Double.parseDouble(currentInput);
                    operation = "*";
                    currentInput = "";
                }
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentInput.isEmpty() && isNumeric(currentInput)) {
                    firstNumber = Double.parseDouble(currentInput);
                    operation = "/";
                    currentInput = "";
                }
            }
        });

        percentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentInput.isEmpty() && isNumeric(currentInput)) {
                    double num = Double.parseDouble(currentInput);
                    double result = calculator.percent(num);
                    currentInput = String.valueOf(result);
                    display.setText(currentInput);
                }
            }
        });

        plusMinusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentInput.isEmpty() && isNumeric(currentInput)) {
                    double num = Double.parseDouble(currentInput);
                    num = num * -1; // Change the sign of the number
                    currentInput = String.valueOf(num);
                    display.setText(currentInput);
                }
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentInput.isEmpty()) {
                    currentInput = currentInput.substring(0, currentInput.length() - 1);
                    display.setText(currentInput);
                }
            }
        });

        allClearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput = "";
                display.setText("0");
                firstNumber = 0;
                operation = "";
            }
        });

        decimalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentInput.contains(".")) {
                    currentInput += ".";
                    display.setText(currentInput);
                }
            }
        });

        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "0";
                display.setText(currentInput);
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "1";
                display.setText(currentInput);
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "2";
                display.setText(currentInput);
            }
        });

        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "3";
                display.setText(currentInput);
            }
        });

        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "4";
                display.setText(currentInput);
            }
        });

        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "5";
                display.setText(currentInput);
            }
        });

        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "6";
                display.setText(currentInput);
            }
        });

        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "7";
                display.setText(currentInput);
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "8";
                display.setText(currentInput);
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentInput += "9";
                display.setText(currentInput);
            }
        });

        equalsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!currentInput.isEmpty() && isNumeric(currentInput)) {
                    double secondNumber = Double.parseDouble(currentInput);
                    double result;

                    switch (operation) {
                        case "+":
                            result = calculator.add(firstNumber, secondNumber);
                            break;
                        case "-":
                            result = calculator.subtract(firstNumber, secondNumber);
                            break;
                        case "*":
                            result = calculator.multiply(firstNumber, secondNumber);
                            break;
                        case "/":
                            if (secondNumber == 0) {
                                display.setText("Error");
                                return;
                            }
                            result = calculator.divide(firstNumber, secondNumber);
                            break;
                        default:
                            display.setText("Error");
                            return;
                    }

                    if (result % 1 == 0) {
                        display.setText(String.format("%d", (int) result));
                    } else {
                        display.setText(String.valueOf(result));
                    }

                    firstNumber = result; // Store the result for the next operation
                    operation = ""; // Clear the operation
                    currentInput = String.valueOf(result); // Set currentInput to the result
                }
            }
        });
    }
    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}