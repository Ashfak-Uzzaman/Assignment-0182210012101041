package com.example.assignment_0182210012101041;

import android.media.Rating;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Task3Activity extends AppCompatActivity {

    RatingBar ratingBar;

    TextView tv_ratingPoint,tv_seekbarValue;

    SeekBar seekBar;

    ProgressBar progressBar;




    void doWork(){

        for(int progress=10;progress<=100;progress+=10){
            try {


                Thread.sleep(1000);
                progressBar.setProgress(progress);

            }

            catch (Exception e){
                e.printStackTrace();
            }

            if(progress==100){
                progress=0;
            }

        }




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_task3);

        // progressbar
        progressBar=findViewById(R.id.progressBar);

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        thread.start();




        // SeekBar
        seekBar=findViewById(R.id.seekBar);
        tv_seekbarValue=findViewById(R.id.tv_seekbar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv_seekbarValue.setText(progress+"/10");



            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





        // RatingBar
        ratingBar=findViewById(R.id.ratingBar);

        tv_ratingPoint=findViewById(R.id.tv_rating);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                tv_ratingPoint.setText("Rating: "+rating); // id and variable same hole golmal lage
            }
        });




//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}