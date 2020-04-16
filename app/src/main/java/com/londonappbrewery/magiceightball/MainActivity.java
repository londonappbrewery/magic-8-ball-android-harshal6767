package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ballDisplay;




       ballDisplay= findViewById(R.id.image_eightball);
        final ImageView ball=(ImageView) findViewById(R.id.image_eightball);

       final int[] ballArray= {
               R.drawable.ball1,
               R.drawable.ball2,
               R.drawable.ball3,
               R.drawable.ball4,
               R.drawable.ball5
               };

        Button myButton;
        myButton=findViewById(R.id.askbutton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("ball"," button has been pressed");
                Random Randomnumbergenerator=new Random();
                int number=Randomnumbergenerator.nextInt(5);
                ball.setImageResource(ballArray[number]);



            }
        });

    }
}
