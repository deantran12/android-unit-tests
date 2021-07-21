package com.sonc.unittests

import android.util.Patterns
import java.util.regex.Pattern

object Validator {
    fun validateEmailByDefault(email: String): Boolean{
        email.run {
            return !isNullOrEmpty() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
        }
    }

    fun validateEmail(email: String): Boolean{
        val p = Pattern.compile("^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$")
        email.run {
            return !isNullOrEmpty() && p.matcher(this).matches()
        }
    }
}