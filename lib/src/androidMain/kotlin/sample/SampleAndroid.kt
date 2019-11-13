package sample

import android.os.Looper

//actual object Logger {
//	actual val isOnMainThread: Boolean = Looper.getMainLooper() === Looper.myLooper()
//}

actual class Sample {
    actual fun checkMe() = 42
}

actual object Platform {
    actual val name: String = "JVM"
}
