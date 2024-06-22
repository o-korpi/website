package se.korpi

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.routing.*
import se.korpi.plugins.*


object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
            .start(wait = true)
    }
}

fun Application.module() {
    routing {
        staticResources("/static", "assets")
    }
    configureTemplating()
    configureRouting()
}
