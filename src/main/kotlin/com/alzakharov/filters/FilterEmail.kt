package com.alzakharov.filters

import com.alzakharov.patterns.email.Email

class FilterEmail(private val email: String) : Filter {
    fun apply() = Email.apply(email)
}
