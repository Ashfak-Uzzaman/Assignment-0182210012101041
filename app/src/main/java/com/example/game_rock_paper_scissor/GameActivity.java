package com.example.game_rock_paper_scissor;
import java.lang.Math;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameActivity extends AppCompatActivity {

    public static final int TOTAL_TURN = 10;
    public static final String[] TURNS = new String[] {"Rock", "Paper", "Scissor"};

    Button rock;
    Button paper;
    Button scissor;


    TextView tvYou;
    TextView tvRobot;

    int you=0;
    int robot=0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_game);

        rock=findViewById(R.id.btn_1);
        paper=findViewById(R.id.btn_2);
        scissor=findViewById(R.id.btn_3);

        tvYou=findViewById(R.id.scoreYou);
        tvRobot=findViewById(R.id.scoreRobot);



        rock.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int randomNum = (int)(Math.random()*(3-1+1)+1);
                Toast.makeText(GameActivity.this,"Mr. Robot was "+TURNS[randomNum-1], Toast.LENGTH_SHORT).show();


                if(randomNum==3) {

                    you++;

                    if(you==TOTAL_TURN){

                        String s=String.valueOf(you);
                        s="            "+s;
                        tvYou.setText(s);
                        s="";
                        s=String.valueOf(you);
                        s="     "+robot;
                        tvRobot.setText(s);

                        Toast.makeText(GameActivity.this,"You won!\nCongratulations!!!", Toast.LENGTH_LONG).show();

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }


                        you=0;
                        robot=0;
                        Toast.makeText(GameActivity.this,"Choose your choice to start again", Toast.LENGTH_SHORT).show();
                        return;

                    }


                }

                else if(randomNum==2) {
                    robot++;

                    if(robot==TOTAL_TURN){

                        String s=String.valueOf(you);
                        s="            "+s;
                        tvYou.setText(s);
                        s="";
                        s=String.valueOf(you);
                        s="     "+robot;
                        tvRobot.setText(s);

                        Toast.makeText(GameActivity.this,"You lost!", Toast.LENGTH_LONG).show();

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }


                        you=0;
                        robot=0;
                        Toast.makeText(GameActivity.this," Choose your choice to start again", Toast.LENGTH_SHORT).show();
                        return;

                    }

                }

                String s=String.valueOf(you);
                s="            "+s;
                tvYou.setText(s);
                s="";
                s=String.valueOf(you);
                s="     "+robot;
                tvRobot.setText(s);
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int randomNum = (int)(Math.random()*(3-1+1)+1);
                Toast.makeText(GameActivity.this,"Mr. Robot was "+TURNS[randomNum-1], Toast.LENGTH_SHORT).show();


                if(randomNum==1) {

                    you++;

                    if(you==TOTAL_TURN){

                        String s=String.valueOf(you);
                        s="            "+s;
                        tvYou.setText(s);
                        s="";
                        s=String.valueOf(you);
                        s="     "+robot;
                        tvRobot.setText(s);

                        Toast.makeText(GameActivity.this,"You won!\nCongratulations!!!", Toast.LENGTH_LONG).show();

                        you=0;
                        robot=0;
                        Toast.makeText(GameActivity.this," Choose your choice to start again", Toast.LENGTH_SHORT).show();
                        return;

                    }


                }

                else if(randomNum==3) {
                    robot++;

                    if(robot==TOTAL_TURN){

                        String s=String.valueOf(you);
                        s="            "+s;
                        tvYou.setText(s);
                        s="";
                        s=String.valueOf(you);
                        s="     "+robot;
                        tvRobot.setText(s);

                        Toast.makeText(GameActivity.this,"You lost!", Toast.LENGTH_LONG).show();

                        you=0;
                        robot=0;
                        Toast.makeText(GameActivity.this," Choose your choice to start again", Toast.LENGTH_SHORT).show();
                        return;

                    }

                }

                String s=String.valueOf(you);
                s="            "+s;
                tvYou.setText(s);
                s="";
                s=String.valueOf(you);
                s="     "+robot;
                tvRobot.setText(s);
            }
        });


        scissor.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                int randomNum = (int)(Math.random()*(3-1+1)+1);
                Toast.makeText(GameActivity.this,"Mr. Robot was "+TURNS[randomNum-1], Toast.LENGTH_SHORT).show();


                if(randomNum==2) {

                    you++;

                    if(you==TOTAL_TURN){

                        String s=String.valueOf(you);
                        s="            "+s;
                        tvYou.setText(s);
                        s="";
                        s=String.valueOf(you);
                        s="     "+robot;
                        tvRobot.setText(s);

                        Toast.makeText(GameActivity.this,"You won!\nCongratulations!!!", Toast.LENGTH_LONG).show();

                        you=0;
                        robot=0;
                        Toast.makeText(GameActivity.this," Choose your choice to start again", Toast.LENGTH_SHORT).show();
                        return;

                    }


                }

                else if(randomNum==1) {
                    robot++;

                    if(robot==TOTAL_TURN){

                        String s=String.valueOf(you);
                        s="            "+s;
                        tvYou.setText(s);
                        s="";
                        s=String.valueOf(you);
                        s="     "+robot;
                        tvRobot.setText(s);

                        Toast.makeText(GameActivity.this,"You lost!", Toast.LENGTH_LONG).show();

                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }


                        you=0;
                        robot=0;
                        Toast.makeText(GameActivity.this," Choose your choice to start again", Toast.LENGTH_SHORT).show();
                        return;


                    }



                }

                String s=String.valueOf(you);
                s="            "+s;
                tvYou.setText(s);
                s="";
                s=String.valueOf(you);
                s="     "+robot;
                tvRobot.setText(s);
            }
        });






//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}