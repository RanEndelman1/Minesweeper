package com.example.ranendelman.minesweeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupStartButton();

        final String ran = "ran";
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.begginer:
                if (checked)
                    // Beginner level chosen
                    break;
            case R.id.medium:
                if (checked)
                    // Medium level chosen
                    break;
            case R.id.hard:
                if (checked)
                    // Hard level chosen
                    break;
        }
    }

    protected void setupStartButton() {
        ImageButton b = (ImageButton) findViewById(R.id.imageButton3);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
