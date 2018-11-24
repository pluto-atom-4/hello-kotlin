package week4

val String.medianChar
    get(): Char? {
        println("Calculation...")
        return getOrNull(length / 2)
    }

val String.middleIndex
    get(): Int? = length / 2

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }

fun main(args: Array<String>) {
    val s = "abc"
    println(s.medianChar)
    println(s.medianChar)
}
