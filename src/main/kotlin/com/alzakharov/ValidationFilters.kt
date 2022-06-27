package com.alzakharov

import com.alzakharov.filters.FilterEmail

object ValidationFilters {
    fun email(email: String) = FilterEmail.invoke(email)
}
