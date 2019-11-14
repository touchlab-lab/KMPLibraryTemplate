package sample

expect object Logger {
	val isOnMainThread: Boolean
}

expect class Sample() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

fun hello(): String = "Hello from ${Platform.name}"
