package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button num_0;
    private Button num_1;
    private Button num_2;
    private Button num_3;
    private Button num_4;
    private Button num_5;
    private Button num_6;
    private Button num_7;
    private Button num_8;
    private Button num_9;
    private Button division;
    private Button multiple;
    private Button minus;
    private Button plus;
    private Button cancle;
    private Button equal;
    String str = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.display);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                switch (view.getId()) {
                    case R.id.num_0:
                        Log.d("click","num_0");
                        str += "0";
                        display.setText(str);
                        break;

                    case R.id.num_1:
                        Log.d("click","num_1");
                        str += "1";
                        display.setText(str);
                        break;

                    case R.id.num_2:
                        Log.d("click","num_2");
                        str += "2";
                        display.setText(str);
                        break;

                    case R.id.num_3:
                        Log.d("click","num_3");
                        str += "3";
                        display.setText(str);
                        break;

                    case R.id.num_4:
                        Log.d("click","num_4");
                        str += "4";
                        display.setText(str);
                        break;

                    case R.id.num_5:
                        Log.d("click","num_5");
                        str += "5";
                        display.setText(str);
                        break;

                    case R.id.num_6:
                        Log.d("click","num_6");
                        str += "6";
                        display.setText(str);
                        break;

                    case R.id.num_7:
                        Log.d("click","num_7");
                        str += "7";
                        display.setText(str);
                        break;

                    case R.id.num_8:
                        Log.d("click","num_8");
                        str += "8";
                        display.setText(str);
                        break;

                    case R.id.num_9:
                        Log.d("click","num_9");
                        str += "9";
                        display.setText(str);
                        break;

                    case R.id.division:
                        Log.d("click","division");
                        str += "/";
                        display.setText(str);
                        break;

                    case R.id.multiple:
                        Log.d("click","multiple");
                        str += "*";
                        display.setText(str);
                        break;

                    case R.id.minus:
                        Log.d("click","minus");
                        str += "-";
                        display.setText(str);
                        break;

                    case R.id.plus:
                        Log.d("click","plus");
                        str += "+";
                        display.setText(str);
                        break;

                    case R.id.equal:
                        Log.d("click","equal");
                        String[] arr = str.split("\\+",2);
                        int num1 = Integer.parseInt(arr[0]);
                        int num2 = Integer.parseInt(arr[1]);
                        int result = num1 + num2;
                        String result1 = String.valueOf(result);
                        display.setText(result1);
                        break;

                    case R.id.cancle:
                        Log.d("click","cancle");
                        str = "";
                        display.setText(str);
                        break;
                }

            }
        };


        num_0 = (Button) findViewById(R.id.num_0);
            num_0.setOnClickListener(listener);
        num_1 = (Button) findViewById(R.id.num_1);
            num_1.setOnClickListener(listener);
        num_2 = (Button) findViewById(R.id.num_2);
            num_2.setOnClickListener(listener);
        num_3 = (Button) findViewById(R.id.num_3);
            num_3.setOnClickListener(listener);
        num_4 = (Button) findViewById(R.id.num_4);
            num_4.setOnClickListener(listener);
        num_5 = (Button) findViewById(R.id.num_5);
            num_5.setOnClickListener(listener);
        num_6 = (Button) findViewById(R.id.num_6);
            num_6.setOnClickListener(listener);
        num_7 = (Button) findViewById(R.id.num_7);
            num_7.setOnClickListener(listener);
        num_8 = (Button) findViewById(R.id.num_8);
            num_8.setOnClickListener(listener);
        num_9 = (Button) findViewById(R.id.num_9);
            num_9.setOnClickListener(listener);
        division = (Button) findViewById(R.id.division);
            division.setOnClickListener(listener);
        multiple = (Button) findViewById(R.id.multiple);
            multiple.setOnClickListener(listener);
        minus = (Button) findViewById(R.id.minus);
            minus.setOnClickListener(listener);
        plus = (Button) findViewById(R.id.plus);
            plus.setOnClickListener(listener);
        cancle = (Button) findViewById(R.id.cancle);
            cancle.setOnClickListener(listener);
        equal = (Button) findViewById(R.id.equal);
            equal.setOnClickListener(listener);
    }
}