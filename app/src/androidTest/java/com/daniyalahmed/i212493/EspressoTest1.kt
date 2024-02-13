package com.daniyalahmed.i212493

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class EspressoTest1 {

    @Test
    fun testLoginToHomeActivity() {

        ActivityScenario.launch(LoginActivity::class.java)

        onView(withId(R.id.login)).perform(click())

        onView(withId(R.id.notificationButton)).check(matches(isDisplayed()))
    }

    @Test
    fun testLoginToForgetPassword() {

        ActivityScenario.launch(LoginActivity::class.java)

        onView(withId(R.id.forgetpassword)).perform(click())

        onView(withId(R.id.send)).check(matches(isDisplayed()))
    }

}