package com.adygreg.getmylocationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView questionTextView;
    Button yesButton;
    Button noButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionTextView = findViewById(R.id.questionTextView);
        yesButton = findViewById(R.id.yesButton);
        noButton = findViewById(R.id.noButton);

    }

    Boolean buttonPressed = false;
    public void yesButtonFunction(View view) {

        if(!buttonPressed) {

            noButton.setVisibility(View.GONE);
            questionTextView.setText("homeless boi gps ACTIVATING");

            Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(intent);

            yesButton.setText("Go Back");
            buttonPressed = true;

        } else {

            questionTextView.setText("Welcome Back, you know the drill :D");
            yesButton.setText("Try Again");
            noButton.setVisibility(View.VISIBLE);
            buttonPressed = false;

        }
    }
    public void noButtonFunction(View view) {
        if (!buttonPressed) {
            yesButton.setVisibility(View.GONE);
            questionTextView.setText("Are you dumb, stupid, or dumb, huh?");

            noButton.setText("Go Back");
            buttonPressed = true;

        } else {

            questionTextView.setText("Don't waste my Time. Now try again");
            noButton.setText("Waste Time");
            yesButton.setVisibility(View.VISIBLE);
            buttonPressed = false;

        }
    }
}