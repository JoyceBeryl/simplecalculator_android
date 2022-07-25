package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    RadioGroup select;
    //RadioButton add,sub,mul,div;
    Button cal;
    TextView res;
    Switch switch1;
    double n1,n2,result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal = findViewById(R.id.cal);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        select = findViewById(R.id.select);
        res = findViewById(R.id.res);
        switch1 =findViewById(R.id.switch1);




        cal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch(select.getCheckedRadioButtonId()) {
                    case R.id.add:
                        n1 = Double.parseDouble(num1.getText().toString());
                        n2 = Double.parseDouble(num2.getText().toString());
                        result =n1+n2;
                        res.setText(Double.toString(result));
                        break;
                    case R.id.sub:
                        n1 = Double.parseDouble(num1.getText().toString());
                        n2 = Double.parseDouble(num2.getText().toString());
                        result =n1-n2;
                        res.setText(Double.toString(result));
                        break;
                    case R.id.mul:
                        n1 = Double.parseDouble(num1.getText().toString());
                        n2 = Double.parseDouble(num2.getText().toString());
                        result =n1*n2;
                        res.setText(Double.toString(result));
                        break;
                    case R.id.div:
                        n1 = Double.parseDouble(num1.getText().toString());
                        n2 = Double.parseDouble(num2.getText().toString());
                        result =n1/n2;
                        res.setText(Double.toString(result));
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + select.getCheckedRadioButtonId());
                }
                if (switch1.isChecked()){
                    res.setText(Math.round(result)+"");
                }
                else{
                    res.setText(result+"");
                }


            }


        });

    }
}