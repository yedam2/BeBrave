package com.example.bebrave;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        final SoundPool bossSound = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        final int boss=bossSound.load(this,R.raw.siren,1); //.mp3 파일지정

        Button bossBtn = (Button) findViewById(R.id.bossBtn); //버튼 초기화
        bossBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                bossSound.play(boss, 1, 1, 0, 0, (float) 1.2);
            }
        });

        final SoundPool orderSound = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        final int order=orderSound.load(this,R.raw.siren,1);

        Button orderBtn = (Button) findViewById(R.id.orderBtn);//버튼 초기화
        orderBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                orderSound.play(order, 1, 1, 0, 0, (float) 1.2);
            }
        });

        final SoundPool doorSound = new SoundPool(1,AudioManager.STREAM_MUSIC,0);
        final int door=doorSound.load(this,R.raw.siren,1);

        Button doorBtn = (Button) findViewById(R.id.doorBtn);//버튼 초기화
        doorBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                doorSound.play(door, 1, 1, 0, 0, (float) 1.2);
            }
        });

    }
}