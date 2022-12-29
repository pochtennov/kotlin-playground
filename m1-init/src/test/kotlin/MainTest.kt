package com.pochtennov.kotlinproject.m1init

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest : StringSpec() {
    init {
        "returnHelloWorld returns what is required" {
            val expected = "Hello World"
            returnHelloWorld() shouldBe expected
        }
    }
}
