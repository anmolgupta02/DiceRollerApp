package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private ImageView imageViewObj1, imageViewObj2;
    private Button rollerButton;
    private Random myRandomNumber1 = new Random();
    private Random myRandomNumber2 = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewObj1 = findViewById(R.id.imageView);
        imageViewObj2 = findViewById(R.id.imageView2);
        rollerButton = findViewById(R.id.button);

        rollerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice1();

            }
        });
    }

    private void rollDice1() {
        int myRanNumber = myRandomNumber1.nextInt(6) + 1;
        int myRanNumber2 = myRandomNumber2.nextInt(6) + 1;
        switch (myRanNumber){
            case 1: imageViewObj1.setImageResource(R.drawable.dice1);
                break;
            case 2: imageViewObj1.setImageResource(R.drawable.dice2);
                break;
            case 3: imageViewObj1.setImageResource(R.drawable.dice3);
                break;
            case 4: imageViewObj1.setImageResource(R.drawable.dice4);
                break;
            case 5: imageViewObj1.setImageResource(R.drawable.dice5);
                break;
            case 6: imageViewObj1.setImageResource(R.drawable.dice6);
                break;
        }

        switch (myRanNumber2){
            case 1: imageViewObj2.setImageResource(R.drawable.dice1);
                break;
            case 2: imageViewObj2.setImageResource(R.drawable.dice2);
                break;
            case 3: imageViewObj2.setImageResource(R.drawable.dice3);
                break;
            case 4: imageViewObj2.setImageResource(R.drawable.dice4);
                break;
            case 5: imageViewObj2.setImageResource(R.drawable.dice5);
                break;
            case 6: imageViewObj2.setImageResource(R.drawable.dice6);
                break;
        }

    }
}

















