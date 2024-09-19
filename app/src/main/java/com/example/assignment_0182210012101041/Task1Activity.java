package com.example.assignment_0182210012101041;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Task1Activity extends AppCompatActivity {



    private static final int DELAY_TIME = 2000; // 2 seconds in milliseconds (2000)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_task1);


        // Create a Handler to post a delayed Runnable
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Create an Intent to launch the next activity
                Intent intent = new Intent(Task1Activity.this, GameActivity.class);
                startActivity(intent);

                // Optionally, finish the SplashScreenActivity if you want to prevent going back to it
                finishAffinity();
            }
        }, DELAY_TIME);

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


    }
}