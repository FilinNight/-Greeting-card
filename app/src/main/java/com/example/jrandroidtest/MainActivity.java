package com.example.jrandroidtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Test()
    {
        double asd = 123123123;
        System.out.println(asd);
        System.out.println("asdsadasdasdasd");
    }
}
