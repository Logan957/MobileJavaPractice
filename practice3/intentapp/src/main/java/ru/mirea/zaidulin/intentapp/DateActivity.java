package ru.mirea.zaidulin.intentapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_string);

        ((TextView)findViewById(R.id.textView)).setText(getIntent().getStringExtra("dateString"));
    }
}
