package com.alzakharov

import com.alzakharov.filters.FilterDate
import com.alzakharov.filters.FilterEmail

object ValidationFilters {
    /**
     * Email validator
     */
    fun email(email: String) = FilterEmail.invoke(email)

    /**
     * Date validator
     *
     * @return list of formats for validation
     */
    fun date() = FilterDate
}
