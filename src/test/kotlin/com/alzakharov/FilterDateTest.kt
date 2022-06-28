package com.alzakharov

import org.junit.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class FilterDateTest {
    @Test
    fun testValidDateWithUsFormat() {
        val date = "3/23/2023"
        assertTrue(
            date.validate { ValidationFilters.date().formatUs(it) },
            "valid date: $date should return 'true' for US format"
        )
    }

    @Test
    fun testInvalidDateWithUsFormat() {
        val date = "2023/23/3"
        assertFalse(
            date.validate { ValidationFilters.date().formatUs(it) },
            "invalid date: $date should return 'false' for US format"
        )
    }

    @Test
    fun testValidDateWithUkFormat() {
        val date = "30/10/1967"
        assertTrue(
            date.validate { ValidationFilters.date().formatUk(it) },
            "valid date: $date should return 'true' for UK format"
        )
    }

    @Test
    fun testInvalidDateWithUkFormat() {
        val date = "1967/10/30"
        assertFalse(
            date.validate { ValidationFilters.date().formatUk(it) },
            "invalid date: $date should return 'false' for UK format"
        )
    }

    @Test
    fun testValidDateWithDeFormat() {
        val date = "20.11.2009"
        assertTrue(
            date.validate { ValidationFilters.date().formatDe(it) },
            "valid date: $date should return 'true' for DE format"
        )
    }

    @Test
    fun testInvalidDateWithDeFormat() {
        val date = "11.20.2009"
        assertFalse(
            date.validate { ValidationFilters.date().formatDe(it) },
            "invalid date: $date should return 'false' for DE format"
        )
    }

    @Test
    fun testValidDateWithDkFormat() {
        val date = "29-02-2004"
        assertTrue(
            date.validate { ValidationFilters.date().formatDk(it) },
            "valid date: $date should return 'true' for DK format"
        )
    }

    @Test
    fun testInvalidDateWithDkFormat() {
        val date = "02-29-2004"
        assertFalse(
            date.validate { ValidationFilters.date().formatDk(it) },
            "invalid date: $date should return 'false' for DK format"
        )
    }

    @Test
    fun testValidDateWithHkFormat() {
        val date = "2006/5/30"
        assertTrue(
            date.validate { ValidationFilters.date().formatHk(it) },
            "valid date: $date should return 'true' for HK format"
        )
    }

    @Test
    fun testInvalidDateWithHkFormat() {
        val date = "2006/30/5"
        assertFalse(
            date.validate { ValidationFilters.date().formatHk(it) },
            "invalid date: $date should return 'false' for HK format"
        )
    }

    @Test
    fun testValidDateWithCnFormat() {
        val date = "2006-5-30"
        assertTrue(
            date.validate { ValidationFilters.date().formatHk(it) },
            "valid date: $date should return 'true' for CN format"
        )
    }

    @Test
    fun testInvalidDateWithCnFormat() {
        val date = "2006-30-5"
        assertFalse(
            date.validate { ValidationFilters.date().formatHk(it) },
            "invalid date: $date should return 'false' for CN format"
        )
    }

    @Test
    fun testValidDateWithCaFormat() {
        val date = "2004-04-30"
        assertTrue(
            date.validate { ValidationFilters.date().formatCa(it) },
            "valid date: $date should return 'true' for CA format"
        )
    }

    @Test
    fun testInvalidDateWithCaFormat() {
        val date = "2004-30-04"
        assertFalse(
            date.validate { ValidationFilters.date().formatCa(it) },
            "invalid date: $date should return 'false' for CA format"
        )
    }

    @Test
    fun testValidDateWithHuFormat() {
        val date = "2004.04.30"
        assertTrue(
            date.validate { ValidationFilters.date().formatCa(it) },
            "valid date: $date should return 'true' for HU format"
        )
    }

    @Test
    fun testInvalidDateWithHuFormat() {
        val date = "2004.30.04"
        assertFalse(
            date.validate { ValidationFilters.date().formatCa(it) },
            "invalid date: $date should return 'false' for HU format"
        )
    }

    @Test
    fun testValidDateWithIso8601Format() {
        val date = "2004-07-12 14:25:59"
        assertTrue(
            date.validate { ValidationFilters.date().formatIso8601(it) },
            "valid date: $date should return 'true' for ISO 8601 format"
        )
    }

    @Test
    fun testInvalidDateWithIso8601Format() {
        val date = "04-07-12 14:25:59"
        assertFalse(
            date.validate { ValidationFilters.date().formatIso8601(it) },
            "invalid date: $date should return 'false' for ISO 8601 format"
        )
    }
}