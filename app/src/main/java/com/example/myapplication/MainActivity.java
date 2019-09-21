package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "Label";

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG , "OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG , "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG , "OnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG , "OnPause");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"OnCreate");
        final Button button = findViewById(R.id.button);
        final Button button2 = findViewById(R.id.button2);
        final Button button4 = findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button2.getBackground().equals(Color.RED))
                button2.setBackgroundColor(Color.BLUE);
                else
                    button2.setBackgroundColor(Color.RED);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button.getBackground().equals(Color.BLUE))
                button.setBackgroundColor(Color.RED);
                else
                    button.setBackgroundColor(Color.BLUE);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
            }
        });
    }


}
