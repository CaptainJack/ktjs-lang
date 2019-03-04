package ru.capjack.tool.ktjs.lang

import org.w3c.dom.events.Event

open class ErrorEventException(event: Event) : RuntimeException(
	event.asDynamic().message.unsafeCast<String?>() ?: "${event::class.js.name}.${event.type}",
	event.asDynamic().error.unsafeCast<Throwable?>()
)