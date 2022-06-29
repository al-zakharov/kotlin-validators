package com.alzakharov.filters

import com.alzakharov.patterns.hex.HexColor

class FilterHexColor(private val color: String) : Filter {
    fun apply() = HexColor.apply(color)
}
