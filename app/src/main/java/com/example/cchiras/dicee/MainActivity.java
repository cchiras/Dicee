package com.example.cchiras.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);
        ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        ImageView rightDice = (ImageView)findViewById(R.id.image_rightDice);

        rollButton.setOnClickListener(v {
            @Override
            public void onClick(View view) {

                Log.d("Dicee", "The button has been pressed");
            }
        });



    }
}
