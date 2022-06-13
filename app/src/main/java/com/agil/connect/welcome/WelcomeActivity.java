package com.agil.connect.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.agil.connect.R;
import com.agil.connect.emailAuth.EmailActivity;
import com.agil.connect.phoneAuth.GenerateOTPActivity;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //Id
        Button email = findViewById(R.id.email);
        Button phone = findViewById(R.id.phone);

        //OnClick
        email.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), EmailActivity.class);
            startActivity(intent);
        });

        phone.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), GenerateOTPActivity.class);
            startActivity(intent);
        });

    }
}