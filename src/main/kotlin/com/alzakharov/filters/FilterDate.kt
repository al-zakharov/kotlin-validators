package com.alzakharov.filters

import com.alzakharov.filters.date.Ca
import com.alzakharov.filters.date.De
import com.alzakharov.filters.date.Dk
import com.alzakharov.filters.date.Hk
import com.alzakharov.filters.date.Uk
import com.alzakharov.filters.date.Us
import com.alzakharov.filters.date.Iso8601

object FilterDate : Filter {
    /**
     * Format validation: m/d/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatUs(date: String) = Us.invoke(date)

    /**
     * Format validation: dd/mm/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatUk(date: String) = Uk.invoke(date)

    /**
     * Format validation: dd/mm/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatVn(date: String) = Uk.invoke(date)

    /**
     * Format validation: dd/mm/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatId(date: String) = Uk.invoke(date)

    /**
     * Format validation: dd/mm/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatEs(date: String) = Uk.invoke(date)

    /**
     * Format validation: dd/mm/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatIt(date: String) = Uk.invoke(date)

    /**
     * Format validation: dd/mm/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatFr(date: String) = Uk.invoke(date)

    /**
     * Format validation: d/m/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatBr(date: String) = Uk.invoke(date)

    /**
     * Format validation: d/m/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatGr(date: String) = Uk.invoke(date)

    /**
     * Format validation: d/m/yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatTh(date: String) = Uk.invoke(date)

    /**
     * Format validation: dd.mm.yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatDe(date: String) = De.invoke(date)

    /**
     * Format validation: dd.mm.yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatBg(date: String) = De.invoke(date)

    /**
     * Format validation: dd.mm.yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatNo(date: String) = De.invoke(date)

    /**
     * Format validation: dd.mm.yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatRo(date: String) = De.invoke(date)

    /**
     * Format validation: dd.mm.yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatRu(date: String) = De.invoke(date)

    /**
     * Format validation: dd.mm.yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatSi(date: String) = De.invoke(date)

    /**
     * Format validation: dd.mm.yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatTr(date: String) = De.invoke(date)

    /**
     * Format validation: dd.mm.yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatUa(date: String) = De.invoke(date)

    /**
     * Format validation: dd.mm.yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatLv(date: String) = De.invoke(date)

    /**
     * Format validation: dd-mm-yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatDk(date: String) = Dk.invoke(date)

    /**
     * Format validation: dd-mm-yyyy
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatPt(date: String) = Dk.invoke(date)

    /**
     * Format validation: yyyy/m/d
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatHk(date: String) = Hk.invoke(date)

    /**
     * Format validation: yyyy/m/d
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatTw(date: String) = Hk.invoke(date)

    /**
     * Format validation: yyyy-m-d
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatCn(date: String) = Hk.invoke(date)

    /**
     * Format validation: yyyy/mm/dd
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatIr(date: String) = Hk.invoke(date)

    /**
     * Format validation: yyyy/mm/dd
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatJp(date: String) = Hk.invoke(date)

    /**
     * Format validation: yyyy-mm-dd
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatCa(date: String) = Ca.invoke(date)

    /**
     * Format validation: yyyy-mm-dd
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatPl(date: String) = Ca.invoke(date)

    /**
     * Format validation: yyyy-mm-dd
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatSe(date: String) = Ca.invoke(date)

    /**
     * Format validation: yyyy-mm-dd
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatLt(date: String) = Ca.invoke(date)

    /**
     * Format validation: yyyy.mm.dd
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatHu(date: String) = Ca.invoke(date)

    /**
     * Format validation: ISO-8061
     *
     * @param date string to validate
     * @return boolean match
     */
    fun formatIso8601(date: String) = Iso8601.invoke(date)
}
