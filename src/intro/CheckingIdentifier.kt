package intro

fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacter(ch: Char) = ch == '_' || ch.isLetterOrDigit()

    if (s.isEmpty() || s[0].isDigit()) {
        return false
    } else {
        for (c: Char in s.substring(1)) {
            if (!isValidCharacter(c)) {
                return false
            }
        }
    }
    return true
}


fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("name_"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}