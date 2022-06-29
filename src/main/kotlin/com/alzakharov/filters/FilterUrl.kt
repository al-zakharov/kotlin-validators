package com.alzakharov.filters

import com.alzakharov.patterns.url.Url

class FilterUrl(private val url: String) {
    fun apply() = Url.apply(url)
}
