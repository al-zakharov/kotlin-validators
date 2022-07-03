# Kotlin-validators

Simple data validation

[![KtLint](https://github.com/al-zakharov/kotlin-validators/actions/workflows/ktlint.yml/badge.svg?branch=master)](https://github.com/al-zakharov/kotlin-validators/actions/workflows/ktlint.yml)
[![Test](https://github.com/al-zakharov/kotlin-validators/actions/workflows/test.yml/badge.svg?branch=master)](https://github.com/al-zakharov/kotlin-validators/actions/workflows/test.yml)

You can easily validate your data like this:
```
val email = "example@alzakharov.com"
email.validate { ValidationFilters.email(it) }
```

Object `ValidationFilters` provides a list of predefined rules

List of validation rules:
```
ValidationFilters.email()
ValidationFilters.date()
ValidationFilters.url()
ValidationFilters.ip()
ValidationFilters.hexColor()
ValidationFilters.password()
```

Some rules such as date, ip, and others provide additional argument for choosing data formats, for example:
```
val date = "3/23/2023"
date.validate { ValidationFilters.date(it, Formats.Country.USA) }
date.validate { ValidationFilters.date(it, Formats.Country.UNITED_KINGDOM) }
date.validate { ValidationFilters.date(it, Formats.Country.GERMANY) }
date.validate { ValidationFilters.date(it, Formats.Country.HONG_KONG) }
etc ..
```

```
val ip = "97.67.44.20"
ip.validate { ValidationFilters.ip(it, Formats.Ip.V4) }
ip.validate { ValidationFilters.ip(it, Formats.Ip.V4_WITH_PORT) }
ip.validate { ValidationFilters.ip(it, Formats.Ip.V6) }
```

Also you can add your own rules like:
```
val password = "example"
password.validate { it.length > 8 }
```