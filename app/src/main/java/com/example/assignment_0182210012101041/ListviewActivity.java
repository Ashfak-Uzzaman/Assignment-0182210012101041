package com.example.assignment_0182210012101041;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.LayoutRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView myListView=findViewById(R.id.listView);

        ArrayList<String>grocery=new ArrayList<>();

        for(int i=1;i<=10;++i){
            grocery.add("10 x "+i+" = "+10*i);
        }
//        grocery.add("Pen");
//        grocery.add("Pencil");
//        grocery.add("Apple");
//        grocery.add("Milk");
//        grocery.add("Tea Leaves");

        // ArrayAdapter Android er class. Array Adapt kore ListView a dekhanor jonno
        // ArrayAdapter will pull the data from the arraylist
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,grocery);
        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String text="Item: "+position+" "+((TextView)view).getText().toString()+" "+id;
                Toast.makeText(ListviewActivity.this, text, Toast.LENGTH_SHORT).show();

            }
        });





    }
}