
fun String.lastChar() = this.get(this.length - 1)


/*fun String.repeat(n: Int): String {
    val sb = StringBuffer(n* length) for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}*/


// when calling this fucntion from java
// repeat("test", 2)

fun main(args: Array<String>) {

    val list = listOf(1,3,4)
    println(list.sum())

    val set = hashSetOf(1, 7, 53)
    println(set)

    val q = """To code,
        |or not to code?..""".trimMargin()

    println(q)


    val a = """
        Keep calm
        and learn Kotlin""".trimIndent()

    println(a)

    val regex = """\d{2}\.\d{2}\.\d{4}""".toRegex()
    println(regex.matches("15.02.2016")) // true
    println(regex.matches("15.02.16"))   // false

    println("123".toInt())      // 123
    println("1e-10".toDouble()) // 1.0E-10

    println("123".toIntOrNull()) // 123
    println("xx".toIntOrNull())  // null
    println("xx".toInt())  // NumberFormatException
}

fun List<Int>.sum(): Int {
    var result = 0
    for (i in this) {
        result += i
    }
    return result
}