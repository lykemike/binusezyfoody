package com.example.binusezyfoody.views;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.binusezyfoody.R;
import com.example.binusezyfoody.databinding.ActivityTopUpBinding;

import org.w3c.dom.Text;

public class TopUpActivity extends AppCompatActivity {
    ActivityTopUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_top_up);

        binding = ActivityTopUpBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.buttonTopTup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String wallet = binding.inputAmount.getText().toString();
                int num = Integer.parseInt(wallet);

                if(num > 2000000) {
                    Toast.makeText(TopUpActivity.this, "Top Up Maximal 2000000", Toast.LENGTH_SHORT);

                } else {
                    binding.showAmount.setText("Rp. " + wallet);
                    Toast.makeText(TopUpActivity.this, "Top Up Successful!", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

}