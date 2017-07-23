package com.example.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class androidLibActivity extends AppCompatActivity {

    TextView  textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_androidlib);

        textView=(TextView)findViewById(R.id.text);
        textView.setText(getIntent().getStringExtra("joke"));


    }
}
