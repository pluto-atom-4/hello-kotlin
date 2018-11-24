package week4

class Person (val name: String)

/* equivalent
class Person (name: String) {
    val name: String

    init {
        this.name = name
    }
}*/

class InternalComponent
internal constructor(name: String) {
    val name: String = name
}

/*class Rectangle(val height: Int, val width: Int) {
    constructor(side: Int): this(side, side) {
        //
    }
}*/

interface Base
class BaseImpl: Base

open class Parent
class Child: Parent()  // <= (...) is used to pass parameter(s) to constructor

open class GermanParent(val name: String)
class GermanChild(name: String): GermanParent(name)

open class SwedishParent(val name: String)
class SwedishChild: SwedishParent{
    constructor(name: String, param: Int): super(name)
}


open class HawaiianParent{
    init {
        print("parent ")
    }
}

class HawaiianChild: HawaiianParent() {
    init {
        print("child ")
    }
}

fun main(args: Array<String>) {
    HawaiianChild()
}