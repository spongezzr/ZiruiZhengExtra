package com.example.michaelz.ziruizhengextra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonESPN, buttonUCSD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonESPN = (Button) findViewById(R.id.buttonESPN);
        buttonESPN.setOnClickListener(this);

        buttonUCSD = (Button) findViewById(R.id.buttonUCSD);
        buttonUCSD.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.buttonESPN:
                Intent y = new Intent(this, ESPN.class);
                startActivity(y);
                break;

            case R.id.buttonUCSD:
                Intent w = new Intent(this, UCSD.class);
                startActivity(w);
                break;
        }
    }
}
