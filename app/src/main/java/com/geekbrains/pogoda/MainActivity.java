package com.geekbrains.pogoda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public class MainActivity extends AppCompatActivity {

        private String inputArg1;
        private String inputArg2;
        private final int REQUEST_CODE = 100;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Button button = findViewById(R.id.button);
            final EditText userInput1stArgEditText = findViewById(R.id.editText1);
            final EditText editText2 = findViewById(R.id.editText2);
            final TextView textView = findViewById(R.id.textView);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    boolean isEqual = checkEquals(userInput1stArgEditText, editText2);
                    printResult(isEqual, textView);
                    Toast.makeText(getBaseContext(), "Это просто текст", Toast.LENGTH_SHORT).show();
                }
            });
        }

        private boolean checkEquals(EditText editText1, EditText editText2) {
            inputArg1 = editText1.getText().toString();
            inputArg2 = editText2.getText().toString();

            return inputArg1.equals(inputArg2);
        }

        private void printResult(boolean result, TextView textView) {
            if(result) {
                textView.setText(R.string.equal);
            } else {
                textView.setText(R.string.not_equal);
            }
        }

    }

    //  я пытался :-)/

