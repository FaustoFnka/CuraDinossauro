package com.example.curadinosauro.ui;


import android.app.Activity;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.curadinosauro.models.*;
import com.example.curadinosauro.R;
import java.util.ArrayList;
import java.util.List;

public class GameActivity extends Activity {
    private TextView statusText, healthText;
    private Button upButton, downButton, leftButton, rightButton, craftButton;
    private ImageView background;
    private Player player;
    private List<Dinosaur> dinosaurs;
    private Handler handler;
    private MediaPlayer backgroundMusic;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        preferences = getSharedPreferences("GamePrefs", MODE_PRIVATE);
        player = new Player("Jogador1");
        dinosaurs = new ArrayList<>();
        dinosaurs.add(new AggressiveDinosaur("Raptor", "Velociraptor", 10, 5, 50, 5, 5));
        dinosaurs.add(new PassiveDinosaur("Trike", "Triceratops", 8, 8, 60, true, 10, 10));

        statusText = findViewById(R.id.statusText);
        healthText = findViewById(R.id.healthText);
        upButton = findViewById(R.id.upButton);
        downButton = findViewById(R.id.downButton);
        leftButton = findViewById(R.id.leftButton);
        rightButton = findViewById(R.id.rightButton);
        craftButton = findViewById(R.id.craftButton);
        background = findViewById(R.id.backgroundImage);

        background.setImageResource(R.drawable.prehistoric_forest);
        backgroundMusic = MediaPlayer.create(this, R.raw.background_music);
        backgroundMusic.setLooping(true);
        backgroundMusic.start();

        handler = new Handler();
        startGameLoop();
    }

    private void startGameLoop() {
        handler.postDelayed(() -> {
            for (Dinosaur dino : dinosaurs) {
                dino.move();
            }
            updateUI();
            startGameLoop();
        }, 2000);
    }

    private void movePlayer(int dx, int dy) {
        player.move(dx, dy);
        statusText.setText("Posição: (" + player.getX() + ", " + player.getY() + ")");
    }

    private void updateUI() {
        runOnUiThread(() -> {
            StringBuilder status = new StringBuilder("Dinossauros:\n");
            for (Dinosaur dino : dinosaurs) {
                status.append(dino.getName()).append(" (X:").append(dino.getX()).append(", Y:").append(dino.getY()).append(")\n");
            }
            statusText.setText(status.toString());
            healthText.setText("Saúde: " + player.getHealth());
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (backgroundMusic != null) {
            backgroundMusic.release();
            backgroundMusic = null;
        }
    }
}
