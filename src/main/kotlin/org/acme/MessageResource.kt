package org.acme

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/api/message")
class MessageResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun getEijiMessage(): String = "Welcome to Quarkus API!"

    @GET
    @Path("/json")
    @Produces(MediaType.APPLICATION_JSON)
    fun getJsonMessage(): Message= Message("Welcome to Quarkus API!")


    @GET
    @Path("/user")  // 新しいパス
    @Produces(MediaType.APPLICATION_JSON)
    fun getUser(): User = User("Eiji", 25, "eiji@example.com")
}

data class Message(
    val content: String
)

// 新しいデータクラス
data class User(
    val name: String,
    val age: Int,
    val email: String
)
