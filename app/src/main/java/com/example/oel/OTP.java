package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OTP extends AppCompatActivity {
    Button sendButton;
    EditText otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        sendButton = (Button)findViewById(R.id.button2);
        otp = (EditText)findViewById(R.id.editTextNumber5);
        Intent intent = getIntent();
        String name = intent.getStringExtra("message_key");

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String otpText = otp.getText().toString();
                if(validateOtpfromApi(otpText,name)){
                    Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                    intent.putExtra("message_key", name);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(),"User abc Otp = 1234",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    private boolean validateOtpfromApi(String otpText, String name){
        boolean ret = false;
        if(name.equals("abc") && otpText.equals("1234")){
            ret = true;
        }
        else {
            ret = false;
        }
        return ret;
    }
}