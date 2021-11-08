package com.example.a1108app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PageActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page);
        tv = findViewById(R.id.tv);
        Intent intent = this.getIntent();
        Bundle b = intent.getExtras();
        String name = b.getString("name");
        tv.setText(name);

    }
}