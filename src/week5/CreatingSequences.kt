package week5

import java.math.BigInteger
import kotlin.random.*

interface Sequence<out T> {
    operator fun iterator(): Iterable<T>
}

// Intermediate operations
/*
fun <T> Sequence<T>.filter(predicate: (T) -> Boolean): Sequence<T> {...}

fun <T, R> Sequence<T>.map(transforme: (T) -> R): Sequence<R> {... }
*/

// Terminal operations
/*
inline fun <T> Sequence<T>.any(predicate: (T) -> Boolean): Boolean {... }

inline fun <T> Sequence<T>.find(predicate: (T) -> Boolean): T? {...}

fun main(args: Array<String>) {...}
*/

fun main(args: Array<String>) {
    val seq = generateSequence { Random.nextInt(5).takeIf{ it > 0} }
    println(seq.toList())

    /*
    val input = generateSequence {
        readLine().takeIf { it != "exit" }
    }
    println(input.toList())
    */

    val numbers = generateSequence(0) { it + 1 }
    println(numbers.take(5).toList())

    val numbersOverflowSafe = generateSequence(BigInteger.ZERO) {
        it + BigInteger.ONE
    }

    val numbersAsQuestined = generateSequence(3) {n ->
        println("Generating element...")
        (n + 1).takeIf { it < 7 }
    }
    println(numbersAsQuestined.first())

    println(numbersAsQuestined.toList())


    /*val numbersWithYeild = buildSequence {
        var x = 0
        while (true) {
            yeild(x++)
        }
    }*/
    /*fun mySequence() = Sequence {
        println("yeild one element")
       // yeild(1)

    }*/

}