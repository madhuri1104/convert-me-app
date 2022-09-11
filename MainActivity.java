package com.example.convertme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mToCm(View view) {
        EditText userInput = findViewById(R.id.input);
        String userInputS = userInput.getText().toString();
        double userInputD = Double.parseDouble(userInputS);
        double outputD = userInputD * 100;
        String outputS = Double.toString(outputD);
        result = findViewById(R.id.result);
        result.setText("Conversion from m to cm:" + outputS);
    }
   public void CmToM(View view)
   {
       EditText userInput = findViewById(R.id.input);
       String userInputS = userInput.getText().toString();
       double userInputD = Double.parseDouble(userInputS);
       double outputD = userInputD * 0.01;
       String outputS = Double.toString(outputD);
       result = findViewById(R.id.result);
       result.setText("Conversion from cm to m:" + outputS);
   }

   public void mToKm(View view)
   {
       EditText userInput = findViewById(R.id.input);
       String userInputS = userInput.getText().toString();
       double userInputD = Double.parseDouble(userInputS);
       double outputD = userInputD * 0.001;
       String outputS = Double.toString(outputD);
       result = findViewById(R.id.result);
       result.setText("Conversion from m to km:" + outputS);
   }
   public void kmToM(View view)
   {
       EditText userInput = findViewById(R.id.input);
       String userInputS = userInput.getText().toString();
       double userInputD = Double.parseDouble(userInputS);
       double outputD = userInputD * 1000;
       String outputS = Double.toString(outputD);
       result = findViewById(R.id.result);
       result.setText("Conversion from km to m :" + outputS);
   }
   public void mToMM(View view){
       EditText userInput = findViewById(R.id.input);
       String userInputS = userInput.getText().toString();
       double userInputD = Double.parseDouble(userInputS);
       double outputD = userInputD * 1000;
       String outputS = Double.toString(outputD);
       result = findViewById(R.id.result);
       result.setText("Conversion from m to mm:" + outputS);
   }
   public void mmToM(View view)
   {
       EditText userInput = findViewById(R.id.input);
       String userInputS = userInput.getText().toString();
       double userInputD = Double.parseDouble(userInputS);
       double outputD = userInputD * 0.001;
       String outputS = Double.toString(outputD);
       result = findViewById(R.id.result);
       result.setText("Conversion from mm to m:" + outputS);
   }
}

