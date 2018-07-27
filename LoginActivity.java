package com.pizzaondeck.www.loginregister;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Amazon reaction imports



public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button button = findViewById(R.id.etLogin);
        button.setOnClickListener(new View.OnClickListener() {

            // When Login button is clicked directs activity to UserActivity.class
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, UserActivity.class));



            }
        });
    }
        // when Register here text is clicked redirects user to RegisterActivity.class
    public void onClick(View view) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));

    }
}
