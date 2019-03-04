import org.jetbrains.kotlin.cli.common.arguments.K2JsArgumentConstants.MODULE_UMD
import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile

plugins {
	id("kotlin2js") version "1.3.21"
	id("nebula.release") version "9.2.0"
	id("ru.capjack.capjack-bintray") version "0.16.1"
}

group = "ru.capjack.tool"

capjackBintray {
	name = "tool-ktjs-lang"
}

repositories {
	jcenter()
}

dependencies {
	implementation(kotlin("stdlib-js"))
}

tasks.withType<KotlinJsCompile> {
	kotlinOptions.moduleKind = MODULE_UMD
}
