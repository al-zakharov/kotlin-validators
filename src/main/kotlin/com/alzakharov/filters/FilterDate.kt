package com.alzakharov.filters

import com.alzakharov.formats.Formats
import com.alzakharov.patterns.date.Ca
import com.alzakharov.patterns.date.De
import com.alzakharov.patterns.date.Dk
import com.alzakharov.patterns.date.Hk
import com.alzakharov.patterns.date.Uk
import com.alzakharov.patterns.date.Us
import com.alzakharov.patterns.date.Iso8601

class FilterDate(
    private val date: String,
    private val format: Formats.Country
) : Filter {
    fun apply() =
        when (format.code) {
            Formats.Country.USA.code -> Us.apply(date)
            Formats.Country.GERMANY.code, Formats.Country.BULGARIA.code, Formats.Country.NORWAY.code -> De.apply(date)
            Formats.Country.ROMANIA.code, Formats.Country.RUSSIA.code, Formats.Country.SLOVENIA.code -> De.apply(date)
            Formats.Country.TURKEY.code, Formats.Country.UKRAINE.code, Formats.Country.LATVIA.code -> De.apply(date)
            Formats.Country.UNITED_KINGDOM.code, Formats.Country.VIETNAM.code, Formats.Country.INDONESIA.code -> Uk.apply(date)
            Formats.Country.SPAIN.code, Formats.Country.ITALY.code, Formats.Country.FRANCE.code -> Uk.apply(date)
            Formats.Country.BRAZIL.code, Formats.Country.GREECE.code, Formats.Country.THAILAND.code -> Uk.apply(date)
            Formats.Country.DENMARK.code, Formats.Country.PORTUGAL.code -> Dk.apply(date)
            Formats.Country.HONG_KONG.code, Formats.Country.TAIWAN.code, Formats.Country.CHINA.code -> Hk.apply(date)
            Formats.Country.IRAN.code, Formats.Country.IRAN.code, Formats.Country.JAPAN.code -> Hk.apply(date)
            Formats.Country.CANADA.code, Formats.Country.POLAND.code, Formats.Country.SWEDEN.code -> Ca.apply(date)
            Formats.Country.LITHUANIA.code, Formats.Country.HUNGARY.code -> Ca.apply(date)
            Formats.Country.ISO_8601.code -> Iso8601.apply(date)
            else -> De.apply(date)
        }
}
