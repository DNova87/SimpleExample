package edu.vsu.dwalter.simpleexample;

import android.test.ActivityInstrumentationTestCase2;
import android.support.test.InstrumentationRegistry;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;


public class SimpleTest
        extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;

    public SimpleTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        mainActivity = getActivity();
    }

    public void testChangeText_sameActivity() {
        onView(withId(R.id.btnClear)).perform(click());
        onView(withId(R.id.txtViewHello)).check(matches(withText("")));
    }
}
