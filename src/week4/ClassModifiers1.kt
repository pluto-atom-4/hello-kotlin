package week4

import week4.Color.*

enum class Color {
    BLUE, ORANGE, RED
}

fun getDescription(color: Color) {
    when (color) {
        BLUE -> "cold"
        ORANGE -> "mild"
        RED -> "hot"
    }
}

enum class ColorRgb(
        val r: Int, val g: Int, val b: Int
) {
    BLUE(0, 0, 255), ORANGE(255, 165, 0), RED(255, 0, 0);
    fun rgb() = (r * 256 + g) * 256 + b
    fun xor(): Int {
        val x = Math.max(Math.max(r, g), b) + Math.min(Math.min(r,g),b)
        return ((x-r) * 256 + x -g) * 256 + (x-r)
    }
}


data class Contact(val name: String, val address: String)


class Foo(val first: Int, val second: Int)

data class Bar(val first: Int, val second: Int)
    // generated method
    /*override fun equals(other: Any?): Boolean {
        if(this === other) return true
        if(other !is Bar) return false
        return (first == other.first
                && second == other.second)
    }*/

fun main(args: Array<String>) {
    println(ColorRgb.BLUE.r)
    println(ColorRgb.BLUE.rgb())

    var contact = Contact("John", "Original Address")
    println(contact)

    val f1 = Foo(1, 2)
    val f2 = Foo(1, 2)

    println(f1 == f2) // false as the referenced objects are  not same unless equals is redefined

    val f3 = f1
    println(f1 == f3) // true

    val b1 = Bar(1, 2)
    val b2 = Bar(1, 2)

    println(b1 == b2)
}