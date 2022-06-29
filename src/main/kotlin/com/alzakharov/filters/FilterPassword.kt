package com.alzakharov.filters

import com.alzakharov.formats.Formats
import com.alzakharov.patterns.password.SixCharacters

class FilterPassword(
    private val password: String,
    private val format: Formats.Password
) : Filter {
    fun apply() =
        when (format.rule) {
            Formats.Password.SIX_CHARACTERS.rule -> SixCharacters.apply(password)
            else -> SixCharacters.apply(password)
        }
}
