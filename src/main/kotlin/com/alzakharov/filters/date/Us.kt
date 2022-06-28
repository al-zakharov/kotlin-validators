package com.alzakharov.filters.date

object Us {
    fun invoke(date: String) = (
        "\\b(0?[1-9]|1[012])([\\/\\-])(0?[1-9]|[12]\\d|3[01])\\2(\\d{4})"
        ).toRegex().matches(date)
}
