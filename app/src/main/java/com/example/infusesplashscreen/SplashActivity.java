package com.example.infusesplashscreen;
import static com.example.infusesplashscreen.R.layout.activity_splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    // Splash screen duration in milliseconds
    private static final int SPLASH_DURATION = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_splash);

        // Create a handler to delay the start of the MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start the MainActivity
                /*Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                //
                startActivity(intent);

                // Close the SplashActivity
                finish(); */
            //delete the asterisk and the slash and replace <<MainActivity>> with the homepage that Marco is making and it should work fine
            }
        }, SPLASH_DURATION);
    }
}
