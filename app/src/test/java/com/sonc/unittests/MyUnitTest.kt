package com.sonc.unittests

import org.junit.Test

class MyUnitTest {
    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue(){
        assert(Validator.validateEmail("son@mail.com"))
    }
}