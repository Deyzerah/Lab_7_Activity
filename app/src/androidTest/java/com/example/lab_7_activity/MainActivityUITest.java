package com.example.lab_7_activity;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.RootMatchers.withDecorView;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;



public class MainActivityUITest
{

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testInvalidName()
    {
        onView(withId(R.id.name)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());



    }

    @Test
    public void testInvalidLastName()
    {
        onView(withId(R.id.name)).perform(typeText("Kamal"), closeSoftKeyboard());
        onView(withId(R.id.lastname)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());


    }

    @Test
    public void testInvalidPassword()
    {
        onView(withId(R.id.name)).perform(typeText("Kamal"), closeSoftKeyboard());
        onView(withId(R.id.lastname)).perform(typeText("Singh"), closeSoftKeyboard());
        onView(withId(R.id.email)).perform(typeText("Test@email.com"), closeSoftKeyboard());
        onView(withId(R.id.password)).perform(typeText(""), closeSoftKeyboard());

        onView(withId(R.id.login)).perform(click());


    }

}
