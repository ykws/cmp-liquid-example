package io.github.ykws.example.liquid

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform