package week3

data class Person(val name: String, val age: Int) {
    fun isOlder(ageLimit: Int) = age > ageLimit
}

fun main(args: Array<String>) {
    // bound reference and unbound reference

    val people = listOf(
            Person("John Joe", 10),
            Person("Jane Joe", 20),
            Person("Foo Boo", 30),
            Person("Hoge Fuge", 40)
    )

    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))

    // how to store function to a variable
    // => use function reference

    fun isEven(i: Int): Boolean = i % 2 == 0

    isEven(3) eq false

    val predicate = ::isEven
    println(predicate(3))

    // equivalent
    val predicate2 = { i: Int -> isEven(i) }
    println(predicate2(3))

    // Member references
    fun sendEmail(person: Person, message: String): String =
            "send a message to ${person.name}, message is $message"

    val action = ::sendEmail

    println(action(people[0], "hello"))

    val list = listOf(1, 2, 3, 4)
    println(list.any(::isEven))
    println(list.filter(::isEven))

    // bound and non-bound references
    // 1. non-bound reference
    val getPredicate = Person::isOlder
    // equivalent
    // val agePredicate: (Person, Int) -> Boolean = Person::isOlder
    //                                              equivalent
    //                                    { person, ageLimit ->
    //                                          person.isOlder(ageLimit) }

    val alice = Person("Alice", 29)
    getPredicate(alice, 21)

    // 2. bound reference
    val erika = Person("Erila", 29)
    val agePredicate = erika::isOlder
    // equivalent
    // val agePredicate: (Int) -> Boolean = erika::isOlder
    //                                      equivalent
    //                                  { ageLimit -> erika.isOlder(ageLimit) }
    agePredicate(21)
}