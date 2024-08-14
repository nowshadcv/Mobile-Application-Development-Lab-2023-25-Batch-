package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btdot,bt0,btc,btadd,btminus,btmul,btdiv,btequal;
    EditText result;
    float mvalueone,mvaluetwo;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt0=(Button) findViewById(R.id.bt0);
        bt1=(Button) findViewById(R.id.bt1);
        bt2=(Button) findViewById(R.id.bt2);
        bt3=(Button) findViewById(R.id.bt3);
        bt4=(Button) findViewById(R.id.bt4);
        bt5=(Button) findViewById(R.id.bt5);
        bt6=(Button) findViewById(R.id.bt6);
        bt7=(Button) findViewById(R.id.bt7);
        bt8=(Button) findViewById(R.id.bt8);
        bt9=(Button) findViewById(R.id.bt9);
        btdot=(Button) findViewById(R.id.btdot);
        btc=(Button) findViewById(R.id.btc);
        btadd=(Button) findViewById(R.id.btadd);
        btminus=(Button) findViewById(R.id.btminus);
        btmul=(Button) findViewById(R.id.btmul);
        btdiv=(Button) findViewById(R.id.btdiv);
        btequal=(Button) findViewById(R.id.btequal);
        result=(EditText) findViewById(R.id.edit1);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        btdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+".");
            }
        });
        btc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }

        });
        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(result.getText()+" ");
                    add=true;
                    result.setText(null);
                }
            }
        });
        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(result.getText()+" ");
                    sub=true;
                    result.setText(null);
                }
            }
        });
        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(result.getText()+" ");
                    mul=true;
                    result.setText(null);
                }
            }
        });
        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result == null){
                    result.setText("");
                }
                else {
                    mvalueone=Float.parseFloat(result.getText()+" ");
                    div=true;
                    result.setText(null);
                }
            }
        });
        btequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mvaluetwo=Float.parseFloat(result.getText()+" ");
                if(add==true){
                    result.setText(mvalueone+mvaluetwo+"");
                    add=false;
                }
                if(sub==true){
                    result.setText(mvalueone-mvaluetwo+"");
                    sub=false;
                }
                if(mul==true){
                    result.setText(mvalueone*mvaluetwo+"");
                    mul=false;
                }
                if(div==true){
                    result.setText(mvalueone/mvaluetwo+"");
                    div=false;
                }
            }
        });
    }
}