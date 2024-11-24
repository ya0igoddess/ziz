package com.github.ya0igoddess.ziz
import dev.kordex.core.ExtensibleBot
import dev.kordex.core.utils.env

suspend fun main() {
    val bot = ExtensibleBot(env("TOKEN")) {

    }
    bot.start()
}