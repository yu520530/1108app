package com.example.a1108app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btn,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn2.setOnClickListener(btnListener);
        btn.setOnClickListener(btnListener);
        btn3.setOnClickListener(btnListener);
        btn4.setOnClickListener(btnListener);
    }
    private View.OnClickListener btnListener = new  View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent;
            String url;
            switch (view.getId())
            {
                case R.id.btn:
                    url = "https://www.nfu.edu.tw/zh/";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                case R.id.btn2:
                    url = "geo:23.702642356000624, 120.42950827291602";
                    intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                    startActivity(intent);
                    break;
                case R.id.btn3:
                    url = "tel:0956903737";
                    intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
                    startActivity(intent);
                    break;
                case R.id.btn4:
                    intent = new Intent();
                    intent.setClass(MainActivity.this, PageActivity.class);
                    Bundle b = new Bundle();
                    b.putString("name","123");
                    intent.putExtras(b);
                    startActivity(intent);
                    break;
            }

        }
    };
}