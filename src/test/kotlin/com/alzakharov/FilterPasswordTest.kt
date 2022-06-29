package com.alzakharov

import com.alzakharov.filters.ValidationFilters
import com.alzakharov.formats.Formats
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class FilterPasswordTest {
    @Test
    fun testValidSixCharactersPassword() {
        var password = "a1b2c3"
        assertTrue(
            password.validate { ValidationFilters.password(it, Formats.Password.SIX_CHARACTERS) },
            "valid password: $password should return 'true'"
        )

        password = "abcdefg123"
        assertTrue(
            password.validate { ValidationFilters.password(it, Formats.Password.SIX_CHARACTERS) },
            "valid password: $password should return 'true'"
        )
    }

    @Test
    fun testInvalidSixCharactersPassword() {
        var password = "abcdefghij"
        assertFalse(
            password.validate { ValidationFilters.password(it, Formats.Password.SIX_CHARACTERS) },
            "invalid password: $password should return 'false'"
        )

        password = "1234567890"
        assertFalse(
            password.validate { ValidationFilters.password(it, Formats.Password.SIX_CHARACTERS) },
            "invalid password: $password should return 'false'"
        )
    }
}
