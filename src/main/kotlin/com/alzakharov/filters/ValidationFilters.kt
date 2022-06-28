package com.alzakharov.filters

import com.alzakharov.formats.Formats

object ValidationFilters {
    /**
     * Email validator
     */
    fun email(email: String) =
        FilterEmail(email).apply()

    /**
     * Date validator
     */
    fun date(date: String, dateFormat: Formats.Country = Formats.Country.GERMANY) =
        FilterDate(date, dateFormat).invoke()
}
