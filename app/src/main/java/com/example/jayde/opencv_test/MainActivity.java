package com.example.jayde.opencv_test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (OpenCVLoader.initDebug())
        {
            Toast.makeText(MainActivity.this, "OpenCV Loaded Successfully!", Toast.LENGTH_SHORT).show();
        }

        else
        {
            Toast.makeText(MainActivity.this, "OpenCV Failed!", Toast.LENGTH_SHORT).show();
        }
    }
}
