package intro

fun foo(): String {
    println("Computing foo...")
    return "Foo"
}

fun max(a: Int, b: Int): Int = if (a > b) {
    a
} else {
    b
}

fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}

fun recongnzie(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know"
}

fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {

    println("HelLo ${args.getOrNull(0)}!")

    println("First ${foo()}, Second ${foo()}")

    val list = mutableListOf<String>("test")
    list.add("Kotlin")

    println(list)

    println(max(10, 20))

    println(listOf('a', 'b', 'c').joinToString(
            separator = "", prefix = "(", postfix = ")"))
    displaySeparator()
    displaySeparator('#', 5)
    displaySeparator(size = 5)
//    displaySeparator(3, '5')

    println(" ")
    println("a: ${checkIfWheather(0)}")
    println("a: ${checkIfWheather(3)}")
    println("a: ${checkIfWheather("test")}")
    println("a: ${checkIfWheather(2.00)}")

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))

    println(recongnzie('$'))
    println(isNotDigit('x'))

    assert("ball" in "a".."k")
    println("ball" in "a".."k") // => true !

}

fun checkIfWheather(a: Any) = when (a) {
    0 -> "is zero"
    is Int -> "is integer"
    is String -> "is string of length ${a.length}"
    else -> "other"
}