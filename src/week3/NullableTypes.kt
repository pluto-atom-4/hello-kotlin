package week3

val s1: String = "test"
val s2: String? = null


fun main(args: Array<String>) {
    val s: String? = null
    if (s != null) {
        println(s.length)
    }
    val length: Int? = if (s != null) s.length else null
    println(length)

    val lenghtNonNullable: Int = s?.length ?: 0

    println(lenghtNonNullable)

    val a: Int? = null
    val b: Int? = 1
    val c: Int = 2

    val s1 = (a ?: 0) + c
    val s2 = (b ?: 0) + c

    println("$s1$s2")

//    isFoo1(null)
//    isFoo2(null)
    isFoo3(null)
    isFoo4(null)

    val x: Int? = 1
    val y: Int = 2
    val sum = x ?: 0 + y
    println(sum)

}

data class Name(var value: String)

fun isFoo1(n: Name) = n.value == "foo"
//fun isFoo2(n: Name?) = n.value == "foo"
fun isFoo3(n: Name?) = n != null && n.value == "foo"

fun isFoo4(n: Name?) = n?.value == "foo"
