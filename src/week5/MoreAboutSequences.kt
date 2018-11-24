package week5

fun m(i: Int): Int {
    print("m$i ")
    return i
}

fun f(i: Int): Boolean {
    print("f$i ")
    return i % 2 == 0
}

fun main(args: Array<String>) {
    listOf(1, 2, 3, 4)
            .map { it * it }
            .find { it > 3 }

    listOf(1, 2, 3, 4)
            .asSequence()
            .map { it * it }
            .find { it > 3 }

    val list = listOf(1, 2, 3, 4)
    list.map(::m).filter(::f)
    println(" ")
//    list.asSequence().map(::m).filter(::f).toList()
//    list.asSequence().map(::m).filter(::f)
    list.asSequence().filter(::f).map(::m).toList()

}