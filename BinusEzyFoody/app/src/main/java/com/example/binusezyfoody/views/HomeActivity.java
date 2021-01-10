package com.example.binusezyfoody.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.binusezyfoody.R;

public class HomeActivity extends AppCompatActivity {

    private Button btnDrink, btnSnack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnDrink = (Button) findViewById(R.id.homeDrinkButton);
        btnDrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDrink();
            }
        });

        btnSnack = (Button) findViewById(R.id.homeSnackButton);
        btnSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSnack();
            }
        });
    }

    public void openDrink() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openSnack() {
        Intent intent = new Intent(this, SnackActivity.class);
        startActivity(intent);
    }

}