package sample

//actual object Logger {
//	actual val isOnMainThread: Boolean = true
//}

actual class Sample {
    actual fun checkMe() = 12
}

actual object Platform {
    actual val name: String = "JS"
}
