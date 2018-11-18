package week3

fun foo(any: Any): String {
    if (any is String) {
        any.toUpperCase()
    }
    return (any as String)?.toUpperCase()
}

fun main(args: Array<String>) {
    println(foo("anｙ"))
    //println(foo(0.0))

    val s = 2.0
    println(s as? Int)
    println(s as Int?)
}