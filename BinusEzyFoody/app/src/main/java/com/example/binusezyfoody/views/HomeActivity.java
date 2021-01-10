package com.example.binusezyfoody.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.binusezyfoody.R;

public class HomeActivity extends AppCompatActivity {

    private Button btnDrink, btnSnack, btnMap, btnTopup, btnFood;

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

        btnMap = (Button) findViewById(R.id.mapButton);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMap();
            }
        });

    btnTopup = (Button) findViewById(R.id.homeTopUpButton);
    btnTopup.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openTopUp();
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

    public void openMap() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void openTopUp() {
        Intent intent = new Intent(this, TopUpActivity.class);
        startActivity(intent);
    }

}