package com.example.anuragshinde.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button mul;
    private Button div;
    private Button sub;
    private Button eql;
    private Button del;
    private TextView result;
    private double val1 = Double.NaN;
    private double val2 = Double.NaN;;
    private final char ADD = '+';
    private final char SUB = '-';
    private final char DIV = '/';
    private final char MUL = '*';
    private char ACTION='#';
    private String firstArg = "";
    private String secondArg = "";
    private boolean wait = false;
    private boolean isOperatorOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setMappings();


        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }


                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "0");
                if(ACTION!='#' && ACTION!='~' &&  ACTION != '!'){
                    wait = false;
                    secondArg+='0';
                }else{
                    firstArg+='0';
                }
            }
        });


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }

                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "1");
                if(ACTION!='#' && ACTION!='~' &&  ACTION != '!'){
                    wait = false;
                    secondArg+='1';
                }else{
                    firstArg+='1';
                }

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }

                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "2");
                if(ACTION!='#' && ACTION!='~' &&  ACTION != '!'){
                    wait = false;
                    secondArg+='2';
                }else{
                    firstArg+='2';
                }


            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }

                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "3");
                if(ACTION!='#' && ACTION!='~' &&  ACTION != '!'){
                    wait = false;
                    secondArg+='3';
                }else{
                    firstArg+='3';
                }


            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }

                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "4");
                if(ACTION!='#' && ACTION!='~' &&  ACTION != '!'){
                    wait = false;
                    secondArg+='4';
                }else{
                    firstArg+='4';
                }


            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }

                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "5");
                if(ACTION!='#' && ACTION!='~' &&  ACTION != '!'){
                    wait = false;
                    secondArg+='5';
                }else{
                    firstArg+='5';
                }


            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }

                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "6");
                if(ACTION!='#'  && ACTION!='~' &&  ACTION != '!'){
                    wait = false;
                    secondArg+='6';
                }else{
                    firstArg+='6';
                }


            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }

                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "7");
                if(ACTION!='#'  && ACTION!='~' &&  ACTION != '!'){
                    wait = false;
                    secondArg+='7';
                }else{
                    firstArg+='7';
                }


            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }


                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "8");
                if(ACTION!='#'  && ACTION!='~' &&  ACTION != '!'){
                    wait = false;
                    secondArg+='8';
                }else{
                    firstArg+='8';
                }


            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION == '!'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                    isOperatorOn = false;
                    wait=false;
                    ACTION='#';
                }

                if(ACTION == '~'){
                    result.setText("");
                    firstArg = "";
                    secondArg = "";
                }

                result.setText(result.getText().toString() + "9");
                if(ACTION!='#' && ACTION!='~' &&  ACTION != '!'){
                    secondArg+='9';
                    wait = false;
                }else{
                    firstArg+='9';
                }


            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isOperatorOn && ACTION != '#'  && ACTION != '!' ){
                    compute();
                }

                if(!wait  && ACTION != '!' ) {
                    ACTION = ADD;
                    result.setText(result.getText().toString() + "+");
                    wait = true;
                    isOperatorOn=true;
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isOperatorOn && ACTION != '#' && ACTION != '!'){
                    compute();
                }
                if(!wait && ACTION != '!') {
                    ACTION = SUB;
                    result.setText(result.getText().toString() + "-");
                    wait = true;
                    isOperatorOn=true;
                }
            }
        });


        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isOperatorOn && ACTION != '#' && ACTION != '!'){
                    compute();
                }

                if(!wait  && ACTION != '!') {
                    ACTION = MUL;
                    result.setText(result.getText().toString() + "*");
                    wait = true;
                    isOperatorOn=true;
                }


            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isOperatorOn && ACTION != '#'  && ACTION != '!'){
                    compute();
                }

                if(!wait  && ACTION != '!') {
                    ACTION = DIV;
                    result.setText(result.getText().toString() + "/");
                    wait = true;
                    isOperatorOn=true;
                }
            }
        });

        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ACTION != '!') {
                    compute();
                    isOperatorOn = false;
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                firstArg = "";
                secondArg = "";
                wait = false;
                ACTION = '#';
                isOperatorOn = false;
            }
        });

    }

    private void compute(){
        if(firstArg != "" && ACTION != '#' && secondArg != ""){
            val1 = Double.parseDouble(firstArg);
            val2 = Double.parseDouble(secondArg);
            switch(ACTION){
                case ADD:
                    val1 = val1 + val2;
                    result.setText(String.valueOf(val1));
                    firstArg = String.valueOf(val1);
                    secondArg = "";
                    ACTION = '~';
                    break;
                case SUB:
                    val1 = val1 - val2;
                    result.setText(String.valueOf(val1));
                    firstArg = String.valueOf(val1);
                    secondArg = "";
                    ACTION = '~';
                    break;
                case MUL:
                    val1 = val1 * val2;
                    result.setText(String.valueOf(val1));
                    firstArg = String.valueOf(val1);
                    secondArg = "";
                    ACTION = '~';
                    break;
                case DIV:
                    if(0 == (int) Math.round(val2)){
                        result.setText("Error");
                        firstArg = "";
                        secondArg = "";
                        ACTION = '!';
                        isOperatorOn = false;
                    }else{
                        val1 = val1 / val2;
                        result.setText(String.valueOf(val1));
                        firstArg = String.valueOf(val1);
                        secondArg = "";
                        ACTION = '~';
                    }
                    break;
            }
        }
    }

    private void setMappings(){
        zero = (Button)findViewById(R.id.btn0);
        one = (Button)findViewById(R.id.btn1);
        two = (Button)findViewById(R.id.btn2);
        three = (Button)findViewById(R.id.btn3);
        four = (Button)findViewById(R.id.btn4);
        five = (Button)findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven = (Button)findViewById(R.id.btn7);
        eight = (Button)findViewById(R.id.btn8);
        nine = (Button)findViewById(R.id.btn9);
        del = (Button)findViewById(R.id.btndel);
        add = (Button)findViewById(R.id.btnadd);
        sub = (Button)findViewById(R.id.btnsub);
        div = (Button)findViewById(R.id.btndiv);
        mul = (Button)findViewById(R.id.btnmul);
        eql = (Button)findViewById(R.id.btneql);
        two = (Button)findViewById(R.id.btn2);
        two = (Button)findViewById(R.id.btn2);
        result = (TextView)findViewById(R.id.result);

    }
}
