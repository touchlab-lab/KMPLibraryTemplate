package sample

//actual object Logger {
//	actual val isOnMainThread: Boolean = NSThread.isMainThread()
//}

actual class Sample {
    actual fun checkMe() = 7
}

actual object Platform {
    actual val name: String = "Native"
}
