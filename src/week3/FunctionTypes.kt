package week3

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    // equivalent
    // val sum: (Int, Int) -> Int = {x,y -> x + y}

    val isEven = { i: Int -> i % 2 == 0 }
    // equivalent
    // val isEven: (Int) -> Boolean = {i: Int -> i % 2 == 0}
    val result = isEven(3)
    println(result)

    var list = listOf(1, 2, 3, 4)
    println(list.any(isEven))
    println(list.filter(isEven));
    {println("Hey!")}()
    run { println("Hey!") }

    //val f1: () -> Int? = null
    //            ~~~~
    //               ↑
    //           return type is nullable
    val f2: () -> Int? = { null }
    val f3: (() -> Int)? = null
    //      ~~~~~~~~~~~~
    //                 ↑
    //        the variable is nullable
    // val f4: (() -> Int)? = { null }


    val f: (() -> Int)? = null
    // When function type is nullable
    if (f != null) {
        f()
    }
    f?.invoke()
    // f()  // => Error:(38, 5) Kotlin: Reference has a nullable type '(() -> Int)?', use explicit '?.invoke()' to make a function-like call instead
}