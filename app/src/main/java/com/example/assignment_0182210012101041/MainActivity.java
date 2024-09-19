package com.example.assignment_0182210012101041;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    public void task1(View view){
        Intent intent=new Intent(MainActivity.this, Task1Activity.class );
        // intent.putExtra(KEY, value);
        startActivity(intent);


    }

    public void task2(View view){
        Intent intent=new Intent(MainActivity.this, Task2Activity.class );
        // intent.putExtra(KEY, value);
        startActivity(intent);

    }

    public void task3(View view){
        Intent intent=new Intent(MainActivity.this, Task3Activity.class );
        // intent.putExtra(KEY, value);
        startActivity(intent);
    }

    public void task4(View view){

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


    }
}