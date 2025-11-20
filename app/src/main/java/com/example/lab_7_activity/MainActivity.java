package com.example.lab_7_activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.firebase.firestore.util.Assert;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;



public class MainActivity extends AppCompatActivity
{
    EditText name, lastname, password, email;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        name = findViewById(R.id.name);
        lastname = findViewById(R.id.lastname);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);


        login.setOnClickListener(v -> {
            String firstname = name.getText().toString().trim();
            String lastnames = lastname.getText().toString().trim();
            String emails = email.getText().toString().trim();
            String passwords = password.getText().toString().trim();

            if (firstname.isEmpty()) {
                Toast.makeText(MainActivity.this, "Invalid Name", Toast.LENGTH_SHORT).show();
                return;
            }
            else if (lastnames.isEmpty())
            {
                Toast.makeText(MainActivity.this, "Invalid Last name", Toast.LENGTH_SHORT).show();
                return;
            }
           else if (passwords.isEmpty())
            {
                Toast.makeText(MainActivity.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                return;
            }
           else if (!emails.contains("@") || !emails.contains("."))
            {
                Toast.makeText(MainActivity.this, "Invalid Email", Toast.LENGTH_SHORT).show();
                return;
            }

            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
        });
    }
}