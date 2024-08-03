package se.korpi.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.pebble.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    install(StatusPages) {
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause", status = HttpStatusCode.InternalServerError)
        }
    }
    routing {
        get("/") {
            call.respond(PebbleContent("templates/index.html", mapOf()))
        }
        
        get("/projects") {
            call.respond(PebbleContent("templates/projects.html", mapOf()))
        }
        
        get("/projects/conveyor") {
            call.respond(PebbleContent("templates/projects/conveyor.html", mapOf()))
        }
        
        get("/projects/sequdiff") {
            call.respond(PebbleContent("templates/projects/sequdiff.html", mapOf()))
        }
        
        get("/projects/query4k") {
            call.respond(PebbleContent("templates/projects/query4k.html", mapOf()))
        }
        
        get("/projects/kotlin-baseuid") {
            call.respond(PebbleContent("templates/projects/kotlin-baseuid.html", mapOf()))
        }
        
    }
}
