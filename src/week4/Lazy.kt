package week4

val lazyValue: String by lazy {
    println("computed")
    "Hello"
}



fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}

