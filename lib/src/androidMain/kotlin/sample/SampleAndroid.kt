package sample

//actual object Logger {
//	actual val isOnMainThread: Boolean = Looper.getMainLooper()
//}

actual class Sample {
    actual fun checkMe() = 42
}

actual object Platform {
    actual val name: String = "JVM"
}
