package com.example.assignment_0182210012101041;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Task2Activity extends AppCompatActivity {


    public void done(View v){
        CheckBox checkBox1=findViewById(R.id.checkbox1);
        CheckBox checkBox2=findViewById(R.id.checkbox2);
        CheckBox checkBox3=findViewById(R.id.checkbox3);

        TextView textView=findViewById(R.id.textview);

        StringBuilder sb=new StringBuilder();


        if(checkBox1.isChecked()){
            sb.append(checkBox1.getText().toString());
            sb.append(", ");
            textView.setText(sb);
        }


        if(checkBox2.isChecked()){
            sb.append(checkBox2.getText().toString());
            sb.append(", ");
            textView.setText(sb);
        }

        if(checkBox3.isChecked()){
            sb.append(checkBox3.getText().toString());
            textView.setText(sb);
        }

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_task2);







//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}