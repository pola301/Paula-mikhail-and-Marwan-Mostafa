package com.example.calculatortutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WelcomeActivity extends Activity {
    private TextView welcomeMessageTextView;
    private EditText nameEditText;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomeactivity);

        welcomeMessageTextView = findViewById(R.id.welcomeMessageTextView);
        nameEditText = findViewById(R.id.nameEditText);
        submitBtn = findViewById(R.id.submitBtn);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String welcomeMessage = "Welcome, " + name + "!";
                welcomeMessageTextView.setText(welcomeMessage);

                //Start the calculator activity here
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
