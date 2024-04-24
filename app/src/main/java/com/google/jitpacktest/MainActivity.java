package com.google.jitpacktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ruffian.library.widget.RTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new RTextView(this);
    }
}