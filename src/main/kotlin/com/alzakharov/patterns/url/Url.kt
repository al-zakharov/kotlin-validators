package com.alzakharov.patterns.url

object Url {
    fun apply(url: String) = (
        "(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?"
        )
        .toRegex().matches(url)
}
