package com.example.proyectoappparte1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Locale;

public class tiempo extends AppCompatActivity {
    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mStartTimeInMillis;
    private long mTimeLeftInMillis;
    private EditText tv_nombre7, tv_series;
    private MediaPlayer mediaPlayer, mediaPlayer2, mediaPlayer3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo);
        mTextViewCountDown = findViewById(R.id.text_view_countdown);
        mButtonStartPause = findViewById(R.id.button_start_pause);
        mButtonReset = findViewById(R.id.button_reset);
        ImageView imageView = findViewById(R.id.iv_pasar7);
        TextView tv_nombre7 = findViewById(R.id.tv_nombre7);
        Aplicacion aplicacion = (Aplicacion) getApplication();
        int imagenSeleccionada = aplicacion.getImagenSeleccionada();
        imageView.setImageResource(imagenSeleccionada);
        String nombreUsuario = aplicacion.getNombreUsuario();
        tv_nombre7.setText(nombreUsuario);
        String GifSeleccionado = getIntent().getStringExtra("gif_seleccionado");
        ImageView imageView2 = findViewById(R.id.gifImageView2);
        Glide.with(this).asGif().load(getResources().getIdentifier(GifSeleccionado, "drawable", getPackageName())).into(imageView2);

        TextView tv_series = findViewById(R.id.tv_series);
        String series = getIntent().getStringExtra("series");
        tv_series.setText(series);
        mediaPlayer = MediaPlayer.create(this, R.raw.silbat_mp3);
        mediaPlayer2 = MediaPlayer.create(this, R.raw.timbre_mp3);
        mediaPlayer3 = MediaPlayer.create(this, R.raw.rocky);


        mButtonStartPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                } else {
                    startTimer();
                }
            }
        });

        mButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetTimer();
            }
        });

        mStartTimeInMillis = 40000; // 40 segundos en milisegundos
        mTimeLeftInMillis = mStartTimeInMillis;
        updateCountDownText();
    }



    private void startTimer() {
        mediaPlayer.start();
        mediaPlayer3.start();
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                mediaPlayer3.stop();
                mediaPlayer2.start();
                mTimerRunning = false;
                mButtonStartPause.setText("Empezar");
                mButtonStartPause.setVisibility(View.INVISIBLE);
                mButtonReset.setVisibility(View.VISIBLE);
            }
        }.start();

        mTimerRunning = true;
        mButtonStartPause.setText("Pausa");
        mButtonReset.setVisibility(View.INVISIBLE);
    }

    private void pauseTimer() {
        mediaPlayer3.stop();



        mCountDownTimer.cancel();
        mTimerRunning = false;
        mButtonStartPause.setText("Continuar");
        mButtonReset.setVisibility(View.VISIBLE);
    }

    private void resetTimer() {
        mTimeLeftInMillis = mStartTimeInMillis;
        updateCountDownText();
        mButtonReset.setVisibility(View.INVISIBLE);
        mButtonStartPause.setVisibility(View.VISIBLE);
    }

    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;

        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        mTextViewCountDown.setText(timeLeftFormatted);
    }
}