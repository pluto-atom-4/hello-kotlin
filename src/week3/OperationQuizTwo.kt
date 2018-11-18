package week3

fun main(args: Array<String>) {
    val heroes = listOf(
            Hero("The Captain", 60, Gender.MALE),
            Hero("Frenchy", 42, Gender.MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, Gender.FEMALE),
            Hero("First Mate", 29, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE)
    )

    val mapByAge: Map<Int, List<Hero>> =
            heroes.groupBy { it.age }
    val (age, group) = mapByAge.maxBy { (_, group) ->
        group.size }!!
    println(age)

    val mapByName: Map<String, Hero> =
            heroes.associateBy { it.name }
    println(mapByName["Frenchy"]?.age)

    println(mapByName["unkonw"]?.age)
    //println(mapByName.getValue("unkonw").age) // =>  java.util.NoSuchElementException: Key unkonw is missing in the map.

    val unknownHero = Hero("Unknown", 0, null)
    println(mapByName.getOrElse("unknown") { unknownHero }.age)



    val (first, second) = heroes
            .flatMap { heroes.map { hero -> it to hero } }
            .maxBy { it.first.age - it.second.age }!!

    println(first)

    // equivalent code
    val allPossiblePairs = heroes
            .flatMap { first ->
                heroes.map { second -> first to second }
            }
    val (oldest, youngest) = allPossiblePairs
            .maxBy { it.first.age - it.second.age }!!
    println(oldest)
}