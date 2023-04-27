package com.example.proyectoappparte1;
import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;



public class MainActivityTemporizador extends AppCompatActivity {
    private Button play;
    private ProgressBar progressBar;
    private CountDownTimer countDownTimer;
    private long timeLeftInMilliseconds = 30000; // 30 segundos
    private boolean timerRunning;
    int sonido_de_Reproduccion;
    private MediaPlayer mp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button) findViewById(R.id.reproducir);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        mp = android.media.MediaPlayer.create(MainActivityTemporizador.this, R.raw.rocky);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timerRunning) {
                    // El temporizador ya está en marcha
                    Toast.makeText(MainActivityTemporizador.this, "El temporizador ya está en marcha.", Toast.LENGTH_SHORT).show();
                } else {
                    startTimer();
                }
                mp.start();
            }
        });
    }

    private void startTimer() {
        countDownTimer = new CountDownTimer(timeLeftInMilliseconds, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMilliseconds = millisUntilFinished;


                // Obtener el número de segundos restantes
                int seconds = (int) (millisUntilFinished / 1000);

                // Verificar si quedan 5 segundos o menos
                if (seconds <= 5) {
                    // Mostrar los segundos restantes en la pantalla
                    Toast.makeText(MainActivityTemporizador.this, String.valueOf(seconds), Toast.LENGTH_SHORT).show();
                }

                updateProgressBar();
            }


            @Override
            public void onFinish() {
                timerRunning = false;
                updateProgressBar();
                Toast.makeText(MainActivityTemporizador.this, "El temporizador ha terminado.", Toast.LENGTH_SHORT).show();
            }
        }.start();

        timerRunning = true;
        updateProgressBar();
    }

    //Método para reproducir MediaPlayer //
    public void MediaPlayer (View view) {
        android.media.MediaPlayer mp = android.media.MediaPlayer.create(MainActivityTemporizador.this, R.raw.rocky);
        mp.start();
    }


    private void updateProgressBar() {
        progressBar.setMax(30000);
        progressBar.setProgress((int) (30000 - timeLeftInMilliseconds));
        progressBar.setVisibility(View.VISIBLE);
    }
}