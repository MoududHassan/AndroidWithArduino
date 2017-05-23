package com.moudud.com.arduinoapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn = (Button) findViewById(R.id.button2);
        et = (EditText) findViewById(R.id.editText2);
        btn.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        et.getText().toString();
    }
}
