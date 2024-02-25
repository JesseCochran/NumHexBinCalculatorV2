package com.megateamaj.numhexbincalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnA, btnB, btnC, btnD, btnE, btnF, btnClear, btnBackspace;
    TextView inputText, outputText;
    final int MAX_INPUT_LENGTH = 12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Spinner spinnerInput = (Spinner) findViewById(R.id.spinInput);
        Spinner spinnerOutput = (Spinner) findViewById(R.id.spinOutput);

        inputText = findViewById(R.id.textViewInput);
        outputText = findViewById(R.id.textViewResult);
        btnClear = findViewById(R.id.buttonClear);
        btnBackspace = findViewById(R.id.buttonBackspace);
        //Button setting
        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btnA = findViewById(R.id.buttonA);
        btnB = findViewById(R.id.buttonB);
        btnC = findViewById(R.id.buttonC);
        btnD = findViewById(R.id.buttonD);
        btnE = findViewById(R.id.buttonE);
        btnF = findViewById(R.id.buttonF);
        //button onclicks
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "0");
                }

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "1");
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "2");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "3");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "4");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "5");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "6");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "7");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "8");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "9");
                }
            }
        });
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "A");
                }
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "B");
                }
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "C");
                }
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "D");
                }
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "E");
                }
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().length() < MAX_INPUT_LENGTH) {
                    inputText.setText(inputText.getText() + "F");
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputText.setText("");
                outputText.setText("");
            }
        });
        btnBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = inputText.getText().toString();
                if (text.length() > 0) {
                    inputText.setText(text.substring(0, text.length() - 1));
                }
            }
        });


// Create an ArrayAdapter using the string array and a default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.numberOptions,
                R.layout.spinner_item
        );
// Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource(R.layout.spinner_dropdown_item);
// Apply the adapter to the spinner.
        spinnerInput.setAdapter(adapter);
        spinnerOutput.setAdapter(adapter);


        spinnerInput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Handle spinner item selection if needed
                if (spinnerInput.getSelectedItem().toString().equals("Decimal")) {
                    btnA.setEnabled(false);
                    btnB.setEnabled(false);
                    btnC.setEnabled(false);
                    btnD.setEnabled(false);
                    btnE.setEnabled(false);
                    btnF.setEnabled(false);

                    btn0.setEnabled(true);
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                    btn5.setEnabled(true);
                    btn6.setEnabled(true);
                    btn7.setEnabled(true);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);

                } else if (spinnerInput.getSelectedItem().toString().equals("Hexadecimal")) {
                    btnA.setEnabled(true);
                    btnB.setEnabled(true);
                    btnC.setEnabled(true);
                    btnD.setEnabled(true);
                    btnE.setEnabled(true);
                    btnF.setEnabled(true);
                    btn0.setEnabled(true);
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                    btn5.setEnabled(true);
                    btn6.setEnabled(true);
                    btn7.setEnabled(true);
                    btn8.setEnabled(true);
                    btn9.setEnabled(true);
                } else if (spinnerInput.getSelectedItem().toString().equals("Binary")) {
                    btnA.setEnabled(false);
                    btnB.setEnabled(false);
                    btnC.setEnabled(false);
                    btnD.setEnabled(false);
                    btnE.setEnabled(false);
                    btnF.setEnabled(false);
                    btn0.setEnabled(true);
                    btn1.setEnabled(true);
                    btn2.setEnabled(false);
                    btn3.setEnabled(false);
                    btn4.setEnabled(false);
                    btn5.setEnabled(false);
                    btn6.setEnabled(false);
                    btn7.setEnabled(false);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);


                } else if (spinnerInput.getSelectedItem().toString().equals("Octal")) {
                    btnA.setEnabled(false);
                    btnB.setEnabled(false);
                    btnC.setEnabled(false);
                    btnD.setEnabled(false);
                    btnE.setEnabled(false);
                    btnF.setEnabled(false);
                    btn0.setEnabled(true);
                    btn1.setEnabled(true);
                    btn2.setEnabled(true);
                    btn3.setEnabled(true);
                    btn4.setEnabled(true);
                    btn5.setEnabled(true);
                    btn6.setEnabled(true);
                    btn7.setEnabled(true);
                    btn8.setEnabled(false);
                    btn9.setEnabled(false);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Do nothing here
            }

        });
        spinnerOutput.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                UpdateOutput();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        inputText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Do nothing here
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                UpdateOutput();
            }

            @Override
            public void afterTextChanged(Editable s) {
//                convert();
            }
        });
    }

    private void UpdateOutput() {
        String input = inputText.getText().toString().trim(); // Trim any leading or trailing spaces
        if (input.isEmpty()) {
            outputText.setText("");
            return;
        }
        String conversionType = ((Spinner) findViewById(R.id.spinInput)).getSelectedItem().toString();
        String outputType = ((Spinner) findViewById(R.id.spinOutput)).getSelectedItem().toString();
        try {
            if (conversionType.equals(outputType)) {
                outputText.setText(input);
            } else if (conversionType.equals("Decimal")) {
                // Parse input as decimal
                long decimalInput = Long.parseLong(input, 10);
                if (outputType.equals("Hexadecimal")) {
                    outputText.setText(Long.toHexString(decimalInput).toUpperCase());
                } else if (outputType.equals("Binary")) {
                    outputText.setText(Long.toBinaryString(decimalInput));
                } else if (outputType.equals("Octal")) {
                    outputText.setText(Long.toOctalString(decimalInput));
                }
            } else if (conversionType.equals("Hexadecimal")) {
                // Parse input as hexadecimal
                long decimalInput = Long.parseLong(input, 16);
                if (outputType.equals("Decimal")) {
                    outputText.setText(String.valueOf(decimalInput));
                } else if (outputType.equals("Binary")) {
                    outputText.setText(Long.toBinaryString(decimalInput));
                } else if (outputType.equals("Octal")) {
                    outputText.setText(Long.toOctalString(decimalInput));
                }
            } else if (conversionType.equals("Binary")) {
                // Parse input as binary
                long decimalInput = Long.parseLong(input, 2);
                if (outputType.equals("Decimal")) {
                    outputText.setText(String.valueOf(decimalInput));
                } else if (outputType.equals("Hexadecimal")) {
                    outputText.setText(Long.toHexString(decimalInput).toUpperCase());
                } else if (outputType.equals("Octal")) {
                    outputText.setText(Long.toOctalString(decimalInput));
                }
            } else if (conversionType.equals("Octal")) {
                // Parse input as octal
                long decimalInput = Long.parseLong(input, 8);
                if (outputType.equals("Decimal")) {
                    outputText.setText(String.valueOf(decimalInput));
                } else if (outputType.equals("Hexadecimal")) {
                    outputText.setText(Long.toHexString(decimalInput).toUpperCase());
                } else if (outputType.equals("Binary")) {
                    outputText.setText(Long.toBinaryString(decimalInput));
                }
            }
        } catch (NumberFormatException e) {
            // Handle invalid input format
            outputText.setText("Too Large");
        }
    }



}