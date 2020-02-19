package com.example.diceroll;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button rollButton;
    ImageView dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rollButton = (Button) findViewById(R.id.rollButton);
        dice = (ImageView) findViewById(R.id.imageView);
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
                dice.startAnimation(animation);
                Random random = new Random();
                int roll = random.nextInt(6)+1;
                image(roll);

            }
        });

    }
    public void image(int rollNumber){
        switch (rollNumber){
            case 1:
                dice.setImageResource(R.drawable.die1);
                break;

            case 2:
                dice.setImageResource(R.drawable.die2);
                break;

            case 3:
                dice.setImageResource(R.drawable.die3);
                break;

            case 4:
                dice.setImageResource(R.drawable.die4);
                break;

            case 5:
                dice.setImageResource(R.drawable.die5);
                break;

            case 6:
                dice.setImageResource(R.drawable.die6);
                break;

        }
    }
}
