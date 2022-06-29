package com.alzakharov

import com.alzakharov.filters.ValidationFilters
import kotlin.test.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class FilterHexColorTest {
    @Test
    fun testValidHexColor() {
        val color = "#00ccff"
        assertTrue(
            color.validate { ValidationFilters.hexColor(it) },
            "valid email: $color should return 'true'"
        )
    }

    @Test
    fun testInvalidHexColor() {
        val color = "#ff000"
        assertFalse(
            color.validate { ValidationFilters.hexColor(it) },
            "invalid color: $color should return 'false'"
        )
    }
}
