package com.example.oel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AddAmount extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

        String prevAmount;
        String[] banks = {"Allied", "HBL", "ALHABIB", "Alfalah", "Other"};
        Button add;
        EditText am;



        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_amount);

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, banks);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
            add = (Button)findViewById(R.id.button8);
            am = (EditText) findViewById(R.id.editTextTextPersonName4);
            add.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

    }
        public void onItemSelected (AdapterView < ? > arg0, View arg1, int position, long id){
        Toast.makeText(getApplicationContext(), banks[position], Toast.LENGTH_LONG).show();
    }
        @Override
        public void onNothingSelected (AdapterView < ? > arg0){
        // TODO Auto-generated method stub
    }


}