package ru.capjack.tool.ktjs.lang

inline fun <T> jso(init: T.() -> Unit): T {
	return js("{}").unsafeCast<T>().apply(init)
}