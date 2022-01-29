package com.fredosuala.fzone

import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.test.ext.junit.rules.ActivityScenarioRule

fun launchSignUpScreen(
    rule: AndroidComposeTestRule<ActivityScenarioRule<MainActivity>, MainActivity>,
    block: SignUpRobot.() -> Unit
) : SignUpRobot {
    return SignUpRobot().apply(block)
}

class SignUpRobot {
    fun typeEmail(email : String) {}
    fun typePassword(password: String) {}
    fun submit(){}

    infix fun verify(
        block: SignUpVerification.() -> Unit
    ): SignUpVerification {
        return  SignUpVerification().apply(block)
    }
}

class SignUpVerification {
    fun timelineScreenIsPresent() {}
}