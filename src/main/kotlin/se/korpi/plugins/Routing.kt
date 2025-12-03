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
        
//        get("/projects") {
//            call.respond(PebbleContent("templates/projects.html", mapOf()))
//        }
//        
//        get("/projects/conveyor") {
//            val conveyorYamlBasic = """
//                project:
//                  name: myProject
//                  group: com.example
//                  version: 0.0.1
//
//                  kotlinVersion: 2.0.0
//                  jvmTarget: 1.8  # Valid values: 1.8, 9, 10, ..., 21. Default 1.8
//                  mainClass: "com.example.myProject.MainKt"
//                  versions:
//
//                  plugins:
//
//                  dependencies:
//
//                  testDependencies:
//            """.trimIndent()
//            
//            val conveyorYaml = """
//                project:
//                  name: myProject
//                  group: com.example
//                  version: 0.0.1
//                  
//                  versions:
//                    kotlin: 2.0.0
//                    ktor: 2.3.12
//                    kotest: 5.9.1
//
//                  kotlinVersion: "${'$'}kotlin"
//                  jvmTarget: 21  # Valid values: 1.8, 9, 10, ..., 21. Default 1.8
//                  mainClass: "com.example.myProject.MainKt"
//                  
//                  plugins:
//                    - "kotlinx-serialization:org.jetbrains.kotlin:kotlin-maven-serialization:${'$'}kotlin"
//                    
//                  dependencies:
//                    - "org.jetbrains.kotlinx:kotlinx-serialization-json:${'$'}kotlin"
//                    - "io.ktor:ktor-server-core:${'$'}ktor"
//                    - "io.ktor:ktor-server-netty:${'$'}ktor"
//                    - "ch.qos.logback:logback-classic:1.4.14"
//                    
//                  testDependencies:
//                    - "io.kotest:kotest-runner-junit5:${'$'}kotest"
//                    - "io.kotest:kotest-assertions-core:${'$'}kotest"
//                    
//            """.trimIndent()
//            
//            call.respond(PebbleContent("templates/projects/conveyor.html", mapOf("basic" to conveyorYamlBasic, "yaml" to conveyorYaml)))
//        }
//        
//        get("/projects/sequdiff") {
//            call.respond(PebbleContent("templates/projects/sequdiff.html", mapOf()))
//        }
//        
//        get("/projects/apifetcher") {
//            call.respond(PebbleContent("templates/projects/apifetcher.html", mapOf()))
//        }
//        
//        get("/projects/dbml2kt") {
//            call.respond(PebbleContent("templates/projects/dbml2kt.html", mapOf()))
//        }
//        
//        get("/projects/query4k") {
//            call.respond(PebbleContent("templates/projects/query4k.html", mapOf()))
//        }
//        
//        get("/projects/kotlin-baseuid") {
//            call.respond(PebbleContent("templates/projects/kotlin-baseuid.html", mapOf()))
//        }
        
    }
}
