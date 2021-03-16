package com.example.emall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerificationActivity extends AppCompatActivity {
    Button btVerify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification);

//        // Take instance of Action Bar
//        // using getSupportActionBar and
//        // if it is not Null
//        // then call hide function
//        if (getSupportActionBar() != null) {
//            getSupportActionBar().hide();
//        }


        btVerify=findViewById(R.id.btVerify);

        btVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(VerificationActivity.this,LoginActivity.class));
            }
        });
    }
}