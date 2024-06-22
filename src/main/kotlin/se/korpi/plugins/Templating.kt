package se.korpi.plugins

import io.ktor.server.application.*
import io.ktor.server.pebble.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.pebbletemplates.pebble.loader.ClasspathLoader

fun Application.configureTemplating() {
    install(Pebble)
}
