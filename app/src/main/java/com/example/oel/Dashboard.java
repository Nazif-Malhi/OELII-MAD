package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {
    String userName;
    String Amount;
    Button profile, addAmount, transHistory, fundTransfer,addsSection;
    TextView name, amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Intent intent = getIntent();
        userName = intent.getStringExtra("message_key");
        name = (TextView) findViewById(R.id.textView6);
        amount = (TextView) findViewById(R.id.textView9);
        name.setText(userName);
        profile = (Button)findViewById(R.id.button4);
        addAmount = (Button)findViewById(R.id.button3);
        transHistory = (Button)findViewById(R.id.button5);
        fundTransfer = (Button)findViewById(R.id.button6);
        addsSection = (Button)findViewById(R.id.button7);

        amount.setText(Amount);


        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Profile.class);
                intent.putExtra("message_key", Amount);
                startActivity(intent);
            }
        });
        addAmount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), AddAmount.class);
                startActivity(intent);
            }
        });
        transHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TransactionHistory.class);
                startActivity(intent);
            }
        });
        fundTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FundTransfer.class);
                startActivity(intent);
            }
        });
        addsSection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Ads.class);
                startActivity(intent);
            }
        });


    }
}