package com.umatthieu.diceee;

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

        Button rollbutton;
        rollbutton = (Button) findViewById(R.id.rollButton);

        ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);
        ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Diceee","button has ben pressed!");
            }
        });
    }
}
