package com.example.curadinosauro.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.example.curadinosauro.R;


public class GameActivity extends Activity {
    private TextView statusText;
    private Button exploreButton, healButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        statusText = findViewById(R.id.statusText);
        exploreButton = findViewById(R.id.exploreButton);
        healButton = findViewById(R.id.healButton);

        exploreButton.setOnClickListener(v -> statusText.setText("Explorando..."));
        healButton.setOnClickListener(v -> statusText.setText("Cura aplicada"));
    }
}
