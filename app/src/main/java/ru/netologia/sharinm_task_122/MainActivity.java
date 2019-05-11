package ru.netologia.sharinm_task_122;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button ForwardButton = findViewById(R.id.ForwardButton);
        final Button BackwardsButton = findViewById(R.id.BackwardsButton);
        final TextView RandomTextView = findViewById(R.id.RandomTextView);

        Random r = new Random();
        RandomTextView.setText(Integer.toString(r.nextInt(100)));

        ForwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        BackwardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
