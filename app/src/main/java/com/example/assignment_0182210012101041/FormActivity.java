package com.example.assignment_0182210012101041;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;
import java.util.regex.Pattern;

public class FormActivity extends AppCompatActivity {

    private EditText etName,etId,etEmail,etMobile,etPassword;
    private Button btnSubmit,btnGoBack;
    private Spinner deptSpinner;

    LinearLayout inputLayout, outputLayout;
    TextView tvOutputText;

    private AlertDialog.Builder builder;

    private String name, id, email, mobile, dept,password;
    private final String[] items = {"Select Department", "CSE", "EEE", "ARCH", "CE", "BuA", "ENG", "LAW", "IS", "BNG", "THM", "PH"};


    private Pattern namePattern = Pattern.compile("[a-z A-Z.]+");
    private Pattern emailPattern = Pattern.compile("(cse|eee|arch|ce|bua|eng|law|is|bng|thm|ph)_[0-9]{15}@lus.ac.bd");
    private Pattern mobilePattern = Pattern.compile("01[3-9][0-9]{8}");
    private Pattern idPattern = Pattern.compile("[0-9]{16}");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);


        inputLayout=findViewById(R.id.inputlayout);
        outputLayout=findViewById(R.id.outputlayout);

        etName=findViewById(R.id.name);
        etId=findViewById(R.id.id);
        etEmail=findViewById(R.id.email);
        etMobile=findViewById(R.id.mobile);
        etPassword=findViewById(R.id.password);

        tvOutputText=findViewById(R.id.outputText);

        btnSubmit=findViewById(R.id.submit);
        btnGoBack=findViewById(R.id.goback);

        deptSpinner=findViewById(R.id.spinner);

        deptSpinner.setAdapter(new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, items));

        deptSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                dept=deptSpinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=etName.getText().toString();
                id=etId.getText().toString();
                mobile= etMobile.getText().toString();
                email=etEmail.getText().toString();
                password=etPassword.getText().toString();



                if (name.isEmpty()){
                    etName.setError("Empty!!");
                    etName.requestFocus();
                }
                else if (!namePattern.matcher(name).matches()){
                    etName.setError("Name can be only Alphabet");
                    etName.requestFocus();
                }



                 else if (id.isEmpty()){
                    etId.setError("Empty!!");
                    etId.requestFocus();
                }
                else if (!idPattern.matcher(id).matches()){
                    etId.setError("Invalid id");
                    etName.requestFocus();
                }

                 else if (email.isEmpty()){
                    etEmail.setError("Empty!!");
                    etEmail.requestFocus();
                }
                else if (!emailPattern.matcher(email).matches()){
                    etEmail.setError("Invalid Email. Use Your Student Email");
                    etEmail.requestFocus();
                }

                 else if (mobile.isEmpty()){
                    etMobile.setError("Empty!!");
                    etMobile.requestFocus();
                }

                else if (!mobilePattern.matcher(mobile).matches()){
                    etMobile.setError("Invalid Mobile number");
                    etMobile.requestFocus();
                }

                else if (password.isEmpty()){
                    etPassword.setError("Empty!!");
                    etPassword.requestFocus();
                }
                 else if (Objects.equals(dept, "Select Department")){
                    Toast.makeText(getApplicationContext(), "Please Select Department", Toast.LENGTH_SHORT).show();
                } else {


                    inputLayout.setVisibility(View.GONE);
                    outputLayout.setVisibility(View.VISIBLE);

                    String s = "Name: " + name + "\nS Id: " + id + "\nEmail: " + email + "\nMobile Number: "+mobile+ "\nDepartment: "+dept ;
                    tvOutputText.setText(s);
                }

            }
        });

        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLayout.setVisibility(View.VISIBLE);
                outputLayout.setVisibility(View.GONE);

                etName.setText("");
                etId.setText("");
                etEmail.setText("");
                etMobile.setText("");
                etPassword.setText("");
                deptSpinner.setSelection(0);

            }
        });













    }
}