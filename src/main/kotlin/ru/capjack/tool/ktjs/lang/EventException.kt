package ru.capjack.tool.ktjs.lang

import org.w3c.dom.events.Event

open class EventException(event: Event) : RuntimeException(
	"${event::class.js.name}.${event.type}".let { m -> (event.asDynamic().message as String?)?.let { "$m: $it" } ?: m },
	event.asDynamic().error.unsafeCast<Throwable?>()
)

