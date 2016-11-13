package com.example.maxim.lab6_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

    Button b1, b2, b3, b4, b5, b6, b7, b8; /*Указатель кнопок*/
    EditText e1, e2, e3; /*Указатель текста*/
        e1 = (EditText) findViewById(R.id.editText1);/*Указатель текстового поля*/
        b1 = (Button) findViewById(R.id.button1);/*Указатель кнопки*/
                String s = e1.getText().toString();/*Читать из поля ввода*/
                   e1.setText(s);/*Писать в поле*/
                     int X=Integer.parseInt(e1.getText().toString());/*Преобразуем содержимое строки в число*/
                        int Res = X%Y;/*остаток от деления*/
                           int Res = X^Y;/*Сумма по модулю два*/
                               String s = Integer.toBinaryString(X);/*перевод в  двоичный*/