package com.example.banking_trading_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class splash1 extends AppCompatActivity {
    private static int WELCOME_TIMEOUT=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash1);


            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent i = new Intent(splash1.this,loginregister.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                    finish();

                }
            }, WELCOME_TIMEOUT);
        }
    }
