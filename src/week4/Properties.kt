package week4

import java.util.*

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() {
            return height == width
        }
}

val foo1 = run {
    println("Calculating the answer...")
}

val foo2: Int
    get() {
        println("Calculating the answer...")
        return 42
    }

class StateLogger {

    var state = false
        set(value) {
            println("State has changed: " +
                    "$field -> $value")
            field = value
        }
}

class LengthCounter {

    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

val foo: Int
    get() {
        return Random().nextInt()
    }

fun main(args: Array<String>) {
    println("$foo1 $foo1 $foo2 $foo2")
    StateLogger().state = true
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
    println(foo)
    println(foo)
    println(foo)
}


