package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Really extends Activity {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_really);
        Button boton = (Button) findViewById(R.id.button);
    }

    public void next (View view){
        Intent i = new Intent(Really.this,guess.class);
        startActivity(i);
        finish();
    }
}
