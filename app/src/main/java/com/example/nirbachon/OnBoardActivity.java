package com.example.nirbachon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class OnBoardActivity extends AppCompatActivity {

    Button button_english, button_bangla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);

        button_english = findViewById(R.id.button_english);
        button_bangla = findViewById(R.id.button_bangla);

        button_english.setOnClickListener(view -> startActivity(new Intent(OnBoardActivity.this, MainActivity.class)));

        button_bangla.setOnClickListener(view -> startActivity(new Intent(OnBoardActivity.this, MainActivity.class)));

    }
}