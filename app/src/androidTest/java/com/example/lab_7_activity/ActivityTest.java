package com.example.lab_7_activity;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;




public class ActivityTest
{
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule = new ActivityScenarioRule<>(MainActivity.class);
    @Test
    public void NameTest() {
        onView(withId(R.id.name)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());
        onView(withText("Invalid Name")).check(matches(isDisplayed()));
    }
    @Test
    public void LastNameCheck()
    {
        onView(withId(R.id.lastname)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());
        onView(withText("Invalid Last Name")).check(matches(isDisplayed()));
    }
    @Test
    public void PasswordCheck()
    {
        onView(withId(R.id.password)).perform(typeText(""), closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());
        onView(withText("Invalid Password")).check(matches(isDisplayed()));
    }
}
