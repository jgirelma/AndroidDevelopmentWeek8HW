package com.example.weekeighthomework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        TextView text = findViewById(R.id.email);
        Intent intent = new Intent(MainActivity.this, Dashboard.class);
        intent.putExtra("userName", text.getText().toString());
        startActivity(intent);
    }
}

