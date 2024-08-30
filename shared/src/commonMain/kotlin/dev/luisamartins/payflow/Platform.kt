package dev.luisamartins.payflow

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform