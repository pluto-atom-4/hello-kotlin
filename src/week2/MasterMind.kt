package week2

data class Evaluation(val positions: Int, val letters: Int)

fun String.masterMind(guess: String): Evaluation {
    // check the provided argument is valid
    if (guess.isNullOrEmpty()) {
        return Evaluation(0, 0)
    }
    if (guess.length > this.length) {
        return Evaluation(0, 0)
    }

    // full score
    if (this.toLowerCase() === guess.toLowerCase()) {
        return Evaluation(this.length, 0)
    }

    // evaluate each of characters
    var positions = 0
    var letters = 0

    var validatedSecret = BooleanArray(this.length)
    var validatedGuess = BooleanArray(guess.length)
    for (i in 0..(this.length - 1)) {
        if (this[i].toLowerCase() === guess[i].toLowerCase()) {
            positions++
            validatedSecret[i] = true
            validatedGuess[i] = true
        }
    }

    for (j in 0..(guess.length - 1)) {
        if (!validatedGuess[j]) {
            for (i in 0..(this.length - 1)) {
                if (!validatedSecret[i] && this[i].toLowerCase() === guess[j].toLowerCase()) {
                    letters++
                    validatedSecret[i] = true
                    validatedGuess[j] = true
                    break
                }
            }
        }
    }
    return Evaluation(positions, letters)
}

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val positions = secret.zip(guess).count { it.first === it.second }

    val commonLetters = "ABCDEF".sumBy { ch ->

        Math.min(secret.count { it === ch }, guess.count { it === ch })
    }
    return Evaluation(positions, commonLetters - positions)
}


fun main(args: Array<String>) {
    var secret = "abcd"
    var guess = "AbcD"
//    println(secret.masterMind(guess))
//    println("ABCD".masterMind("ABCD"))
//    println("ABCD".masterMind("CDBA"))
//    println("ABCD".masterMind("ABDC"))
//    println("AABC".masterMind("ADFE"))
//    println("DCFC".masterMind("ABEC"))
//    println("ADFE".masterMind("AABC"))

//    println(secret.zip(guess).count { it.first === it.second })

//      println("ABCDEF".sumBy { ch: Char -> "AAAA".count { it === ch } })

//    val iterable = listOf(1, 2, 3)
//
//    println(iterable.count())
//    println(iterable.count {it % 2 == 1})

    println(evaluateGuess("ADFE", "AABC"))

}