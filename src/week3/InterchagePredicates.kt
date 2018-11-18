package week3

import kotlin.math.absoluteValue

// OK
fun List<Int>.allNonZero() = all { it != 0 }
fun List<Int>.allNonZero1() = none { it == 0 }

fun List<Int>.containsZero() = !any { it == 0 }

//  questionable
fun List<Int>.allNonZero2() = any {  it == 0 }

fun List<Int>.containsZero1() = !all { it != 0 }
fun List<Int>.containsZero2() = !none { it == 0 }


fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3)
    val list2 = listOf(0, 1, 2)

    /*println(list2.filter { it == 0 })
    println(list2.any { it ==0 })
    println(list2.none { it ==0 })
    println(list2.all { it ==0 })
    println(list2.filter { it !=0 })
    println(list2.any { it !=0 })
    println(list2.none { it !=0 })
    println(list2.all { it !=0 })*/

    println(list1.allNonZero())
    println(list1.allNonZero1())
    println(list1.allNonZero2())
    println("----")
    println(list1.containsZero())
    println(list1.containsZero1())
    println(list1.containsZero2())
    println("====")

    println(list2.allNonZero())
    println(list2.allNonZero1())
    println(list2.allNonZero2())
    println("----")
    println(list2.containsZero())
    println(list2.containsZero1())
    println(list2.containsZero2())
}

