package week3

fun main(args: Array<String>) {
    val countOfSatisfied: Int = 0
    println(countOfSatisfied)
    println(countOfSatisfied.inc())
    println(countOfSatisfied.inc())


    println(Regex("""^(?!.*(ba|bu))""").containsMatchIn("abb"))

    println(Regex(""".*[aeiou].*""").matches("bcde"))
    println(println(Regex(""".*[aeiou].*""").matches("bcde")))
    val m = Regex(""".*[aeiou].*""").findAll("bacde")
    m.iterator().forEach { println(it.value) }

    //println("aza".flatMap { first -> "aza".map { second -> first to second } }.count { pair -> pair.first == pair.second })



}