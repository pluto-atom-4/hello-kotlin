package week5

/*
inline fun <T> Iterable<T>.myfilter(predicate: (T) -> Boolean): List<T> {}
inline fun <T, R> Iterable<T>.myMap(transform: (T) -> R): List<R> {}
inline fun <T> Iterable<T>.myAny(precidate: (T) -> Boolean): Boolean {}
inline fun <T> Iterable<T>.myFind(predicate: (T) -> Boolean): T? {}
inline fun <T, K> Iterable<T>.myGroupBy(keySelector: (T) -> K): Map<K, List<T> {}
*/

fun main(args: Array<String>) {
    val list = listOf(1,2, -3)
    val maxOddSquare = list
            .map { it * it }
            .filter { it % 2 == 1 }
            .max()
    println(maxOddSquare)

    val maxOddSquareUtilizingSequence = list
            .asSequence()
            .map { it * it }
            .filter { it % 2 == 1 }
            .max()
}

/*
 Oprtsyiond on vollrvyiond
 * lambda are inlined (no performance overhead)
 *
 * but: intermediate collections are created fro chained calls
 */


/*
  Collections vs Sequences

     eager vs laze evaluation
 */