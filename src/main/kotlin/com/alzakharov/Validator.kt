package com.alzakharov

inline fun <T> T.validate(block: (T) -> Boolean): Boolean {
    return block(this)
}
