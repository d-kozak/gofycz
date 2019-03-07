package io.dkozak.gofycz.init

import io.dkozak.gofycz.entity.GofyczTask

fun task(challenge: String) = GofyczTask(challenge = challenge)

val initTasks = listOf(
        task("Talk to a random person on the street"),
        task("Give someone flowers"),
        task("Talk to a musician on the street"),
        task("Watch the sunset")
)