package week5

import java.io.BufferedReader
import java.io.FileReader
import java.util.ArrayList
import java.util.concurrent.locks.Lock

fun myRun(f: () -> Unit) = f()

inline fun <R> myRun2(block: () -> R): R = block()

inline fun <T> T.myTakeUnless(predicate: (T) -> Boolean): T? =
        if (!predicate(this)) this else null

inline fun <T> mySynchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}


fun foo(lock: Lock) {
    mySynchronized(lock) {
        println("Action")
    }

    // compiler generates the bytecode
    // fun foo(lock: Lock) {
    //   lock.lock()
    //   try {
    //     println("Action")
    //   } finally {
    //      lock.unlock()
    //   }
    // }
}


fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use {
        br -> return br.readLine()
    }
}

inline fun <T> Iterable<T>.myFilter(predicate: (T) -> Boolean): List<T> {
    val destination = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            destination.add(element)
        }
    }
    return destination
}


fun filterNonZero(list: List<Int>): List<Int>  {
    val destination = ArrayList<Int>()
    for (element in list) {
        if (element != 0) {
            destination.add(element)
        }
    }
    return destination
}


fun main(args: Array<String>) {
    val name = "Kotlin"
    myRun { println("Hi, $name!") }
    //       ↑
    //    class ExampleKt@main$1
    // anonymous class is created corresponding to this lambda, if the lambda captures any variables, then
    // a new object will be crated to store the contents,
    // the body of the lambda for each invocation.
    // That's quite an overhead


    // inline function
    // compiler substitutes a body of the function
    // instead of calling it

    myRun2 { println("Hi, $name!") }
    // myRun2 is an inline function
    // and compiler generates the code
    //  val name = "Kotlin"
    //  println("Hi, $name!")

}