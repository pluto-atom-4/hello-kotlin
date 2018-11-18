package week3


data class Employee(val city: City, val age: Int)

enum class City {
    PRAGUE,
    PARIS
}

fun main(args: Array<String>) {
    val employees: List<Employee> = listOf(
            Employee(City.PRAGUE, 20),
            Employee(City.PARIS, 40),
            Employee(City.PRAGUE, 30)
    )

    println(employees.filter { it.city == City.PRAGUE }
            .map { it.age }
            .average())

    val map: Map<Int, Employee> = mapOf(
            1 to Employee(City.PRAGUE, 20),
            2 to Employee(City.PARIS, 40),
            3 to Employee(City.PRAGUE, 30)
    )

    map.mapValues { (k, v) -> println("key: $k, value: $v") }
    map.mapValues { (_, v) -> println("value: $v") }

}
