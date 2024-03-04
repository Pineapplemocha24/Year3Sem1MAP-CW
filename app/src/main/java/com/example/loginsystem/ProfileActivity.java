package com.example.loginsystem;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    TextView usernameTextView, emailTextView, lastLoginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        usernameTextView = findViewById(R.id.usernameTextView);
        emailTextView = findViewById(R.id.emailTextView);
        lastLoginTextView = findViewById(R.id.lastLoginTextView);

        // Retrieve user session data (username and email)
        SharedPreferences preferences = getSharedPreferences("USER_PREFS", MODE_PRIVATE);
        String username = preferences.getString("username", "");
        String email = preferences.getString("email", "");

        // Display user profile information
        usernameTextView.setText(username);
        emailTextView.setText(email);

        // Here, you can retrieve and display the last login time if available.
        // For demonstration purposes, let's set it as "Not available".
        lastLoginTextView.setText("Last Login: Not available");
    }
}
