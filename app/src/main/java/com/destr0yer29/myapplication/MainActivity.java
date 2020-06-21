package com.destr0yer29.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static String name = "Manish";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG , "onCreate: Started");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.text);
        Button button = findViewById(R.id.button);


        if (null != savedInstanceState){
            String name = savedInstanceState.getString("name");
            if (null != name){
                text.setText(name);
            }
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(name);
            }
        });

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("name",name);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG , "onStart: started");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG , "onResume: started");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG , "onPause: started");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG , "onStop: started");
        super.onStop();
    }

    @Override
    protected void onRestart() {
        Log.d(TAG , "onRestart: started");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG , "onDestroy: started");
        super.onDestroy();
    }
}
