package com.example.lab_7_activity;

import static org.junit.Assert.*;
import androidx.test.annotation.UiThreadTest;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import android.widget.EditText;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MainActivityUnitTest
{

    @Rule
    public ActivityScenarioRule<MainActivity> rule = new ActivityScenarioRule<>(MainActivity.class);

    private MainActivity activity;
    private EditText name, lastname, password;

    @Before
    public void setUp() {
        rule.getScenario().onActivity(a ->
        {
            activity = a;
            name = a.findViewById(R.id.name);
            lastname = a.findViewById(R.id.lastname);
            password = a.findViewById(R.id.password);
        });
    }

    @Test
    @UiThreadTest
    public void testNameValidation()
    {
        name.setText("Kamal");
        assertEquals("Kamal", name.getText().toString());
    }

    @Test
    @UiThreadTest
    public void testLastNameValidation()
    {
        lastname.setText("Singh");
        assertEquals("Singh", lastname.getText().toString());
    }

    @Test
    @UiThreadTest
    public void testPasswordValidation()
    {
        password.setText("12345");
        assertTrue(password.getText().toString().length() >= 5);
    }
}
