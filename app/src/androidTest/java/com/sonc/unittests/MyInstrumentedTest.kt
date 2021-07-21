package com.sonc.unittests

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyInstrumentedTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue(){
        assert(Validator.validateEmailByDefault("son@mail.com"))
    }
}