package week3

data class Hero (
        val name: String,
        val age: Int,
        val gender: Gender?
)

enum class Gender {
    MALE,
    FEMALE
}

fun main(args: Array<String>) {
    val heroes = listOf<Hero>(
            Hero("The Captain", 60, Gender.MALE),
            Hero("Frenchy", 42, Gender.MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, Gender.FEMALE),
            Hero("First Mate", 29, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE)
    )

    println(heroes.last().name)
    println(heroes.firstOrNull { it.age == 30 }?.name)
    println(heroes.map { it.age }.distinct().count())
    println(heroes.filter { it.age < 30 }.size)

    val (youngest, oldest) = heroes.partition { it.age < 30 }
    println(oldest.size)
    println(youngest)

    println(heroes.maxBy { it.age }?.name)

    println(heroes.all { it.age < 50 })
    println(heroes.any { it.gender == Gender.FEMALE })
}