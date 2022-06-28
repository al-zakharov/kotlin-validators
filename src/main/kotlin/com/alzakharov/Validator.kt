package com.alzakharov

/**
 * Validate value apply function block
 */
inline fun <T> T.validate(block: (T) -> Boolean): Boolean {
    return block(this)
}
