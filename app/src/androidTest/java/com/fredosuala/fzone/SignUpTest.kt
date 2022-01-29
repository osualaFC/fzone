package com.fredosuala.fzone

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import org.junit.Rule
import org.junit.Test

class SignUpTest {

    @get:Rule
    val signUpTestRule = createAndroidComposeRule<MainActivity>()
    @Test
    fun performSignUp() {
        launchSignUpScreen {
            typeEmail("test@test@gmail.com")
            typePassword("password")
            submit()
        } verify {
            timelineScreenIsPresent()
        }
    }
}