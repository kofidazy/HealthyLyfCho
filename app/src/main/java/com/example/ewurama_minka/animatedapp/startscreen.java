package com.example.ewurama_minka.animatedapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class startscreen extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

    }

    @Override
    protected void onResume() {
        super.onResume();

        playThemeSong();

    }

    public void soundandgame(View view) {


//        nicholas.setText("Nicholas (Clicked!) ");

        startActivity(new Intent(startscreen.this, MainGameClass.class));

    }




}
