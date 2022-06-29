package com.alzakharov.filters

import com.alzakharov.formats.Formats
import com.alzakharov.patterns.ip.V4
import com.alzakharov.patterns.ip.V4WithPort
import com.alzakharov.patterns.ip.V6

class FilterIp(
    private val ip: String,
    private val format: Formats.Ip
) : Filter {
    fun apply() =
        when (format.version) {
            Formats.Ip.V4.version -> V4.apply(ip)
            Formats.Ip.V4_WITH_PORT.version -> V4WithPort.apply(ip)
            Formats.Ip.V6.version -> V6.apply(ip)
            else -> V4.apply(ip)
        }
}
