package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
 Button sendButton;
 EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendButton = (Button)findViewById(R.id.button);
        name = (EditText)findViewById(R.id.editTextTextPersonName);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = name.getText().toString();
                Intent intent = new Intent(getApplicationContext(), OTP.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
    }


}