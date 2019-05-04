package com.example.lifecycleapp;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String TAG =  "mainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"OnCreate Called",Toast.LENGTH_SHORT).show();
        Log.v(TAG,"OnCreate Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"onStart Called",Toast.LENGTH_SHORT).show();
        Log.v(TAG,"onStart Called");

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(MainActivity.this,"onPostResume",Toast.LENGTH_SHORT).show();
        Log.v(TAG,"onPostResume Called");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_SHORT).show();
        Log.v(TAG,"onPause Called");

    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"onStop Called",Toast.LENGTH_SHORT).show();
        Log.v(TAG,"onStop Called");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"onDestroy Called",Toast.LENGTH_SHORT).show();
        Log.v(TAG,"onDestroy Called");

        Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_LONG).show();

    }

}
