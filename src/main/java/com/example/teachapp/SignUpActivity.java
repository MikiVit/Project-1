package com.example.teachapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity {

    private EditText name, email, pass, confirmPass;
    private Button signUpB;
    private ImageView backB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        name = findViewById(R.id.user_name);
        email = findViewById(R.id.emailId);
        pass = findViewById(R.id.password);
        confirmPass = findViewById(R.id.confirm_pass);
        signUpB = findViewById(R.id.signUpB);
        backB = findViewById(R.id.backB);

        backB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        signUpB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

            }
        });




    }
}