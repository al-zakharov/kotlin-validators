package com.alzakharov

import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class FilterEmailTest {
    @Test
    fun testValidEmailAddresses() {
        val email = "kotlin-validators@alzakharov.com"
        assertTrue(
            email.validate { ValidationFilters.email(it) },
            "valid email: $email should return 'true'"
        )
    }

    @Test
    fun testInvalidEmailAddresses() {
        var email = "kotlin-validators@alzakharov"
        assertFalse(
            email.validate { ValidationFilters.email(it) },
            "invalid email should return 'false'"
        )

        email = "@alzakharov.com"
        assertFalse(
            email.validate { ValidationFilters.email(it) },
            "invalid email should return 'false'"
        )
    }
}
