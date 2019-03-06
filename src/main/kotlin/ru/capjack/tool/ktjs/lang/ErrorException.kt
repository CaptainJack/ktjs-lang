package ru.capjack.tool.ktjs.lang

open class ErrorException(error: dynamic) : RuntimeException(
	"${error::class.js.name}.${error.type}".let { m -> (error.message as String?)?.let { "$m: $it" } ?: m },
	error as? Throwable
)