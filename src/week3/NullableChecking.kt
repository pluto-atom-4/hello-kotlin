package week3

// Implement an extension function "isEmptyOrNull()" on the type String
// It should be returned true if the string is empty or null


fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    println(s2.isEmptyOrNull())
}

private fun String?.isEmptyOrNull(): Boolean {
    return this == null || this.isEmpty()
}

