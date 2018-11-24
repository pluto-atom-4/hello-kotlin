package week5

val foo = run {
    println("Calculating foo...")
    "foo"
}


fun getEmail(): Email? {
    val email = Email("test@email.cc")
    println("email")
    return null
}

data class Email(val email: String)

interface Session {
    val user: User
}

open class User (val accountId: String)

fun analyzeUserSession(session: Session) {
    /*val user = session.user
    if (user is FacebookUser) {
        println(user.accountId)
    }*/
    (session.user as? FacebookUser)?.let {
        println(it.accountId)
    }
}

class FacebookUser(accountId: String) : User(accountId)

fun main(args: Array<String>) {
    val email = getEmail()
    // let function to check the argument for
    // being non-null, not only the receiver
    email?.let { e -> println("${e.email}") }
    getEmail().let { println(it) }
    val number = 42
    // takeIf function returns the receiver if it satisfies the given predicate
    // or return null
    println(number.takeIf { it > 10 })
    // takeUnless is the opposite fo tekeIf funciton
    println(number.takeUnless { it > 10  })
    // repeat function an action for a given number of times
    repeat(10) {
        print("Welcome.. ")
    }
    println(" kotlin")
}