package com.example.assignment_0182210012101041;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Task2Activity extends AppCompatActivity {



    CheckBox[] checkBoxes;
    TextView cart,cartHeading;

    RadioGroup paymentMethod;

    RadioButton cash,online;


    private final int[] prices={250,30,350,400};

    boolean[] chosen={false,false,false,false};

    public void confirmOrder(View v){

        int totalPayment=0;

        StringBuilder sb=new StringBuilder();

        for(int i=0;i<4;++i){
            if(chosen[i]){
                totalPayment+=prices[i];
                sb.append(checkBoxes[i].getText().toString());
                sb.append("\n\n");
            }
        }

        if(sb.length()==0){
            cartHeading.setText("Cart");
            cart.setText("Please add products to cart");
            return;
        }



        sb.append("Total:           ");
        sb.append(Integer.toString(totalPayment));
        sb.append("/-\n\n");



        if(cash.isChecked()){
            sb.append("Cash on delivery");

        }

        else if(online.isChecked()){
            sb.append("Online payment");
        }
        cartHeading.setText("Order details");
        cart.setText(sb);


    }

    public void onCheckBoxClick(View view){
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<4;++i){

            if(checkBoxes[i].isChecked()){
                chosen[i]=true;
                sb.append(checkBoxes[i].getText().toString());
                sb.append("\n\n");
            }
            else{
                chosen[i]=false;
            }

        }

        cart.setText(sb);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_task2);

        checkBoxes=new CheckBox[4];
        checkBoxes[0]=findViewById(R.id.checkbox1);
        checkBoxes[1]=findViewById(R.id.checkbox2);
        checkBoxes[2]=findViewById(R.id.checkbox3);
        checkBoxes[3]=findViewById(R.id.checkbox4);

        cart=findViewById(R.id.cart);
        cartHeading=findViewById(R.id.cartheading);

        paymentMethod=findViewById(R.id.paymentMethod);

        cash=findViewById(R.id.cash);
        online=findViewById(R.id.online);


//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}