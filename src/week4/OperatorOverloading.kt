package week4

fun main(args: Array<String>) {
    val list1 = listOf(1, 2, 3)
    var list2 = list1
    list2 += 4
    // the above code is to create a new list
    // list2 = list1 + 4
    println(list1)
    println(list2)


    val list3 = mutableListOf(1,2,3)
    val list4 = list3

    list4 +=4
    // the above code is to update the list3 and list4 as
    // a list3's reference
    println(list3)
    println(list4)
}