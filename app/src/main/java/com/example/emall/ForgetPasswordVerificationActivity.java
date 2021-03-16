package com.example.emall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgetPasswordVerificationActivity extends AppCompatActivity {
    Button btVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        btVerify=findViewById(R.id.btVerify);

        btVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ForgetPasswordVerificationActivity.this,ResetPasswordActivity.class));
            }
        });
    }
}