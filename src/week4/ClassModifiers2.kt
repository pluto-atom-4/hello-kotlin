package week4


sealed class Expr
class Num(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(e: Expr): Int = when (e) {
    is Num -> e.value
    is Sum -> eval(e.left) + eval(e.right)
}

class Controller(val repository: Repository,
                 val logger: Logger) : Repository by repository,
        Logger by logger

fun use(controller: Controller) {
    controller.logAll()
}

interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): List<Customer>
}

data class Customer(val name: String)

interface Logger {
    fun logAll()
}


class E {
    companion object {
        @JvmStatic
        fun foo() {
            println("foo()")
        }

        fun bar() {
            println("bar()")
        }
    }
}

// Java can access
// C.foo()
// error C.bar()
// C.Companion.foo()
// C.Companion.bar()

object Obj {
    @JvmStatic
    fun foo() {
        println("foo()")
    }
    fun bar() {
        println("bar()")}
}

// Java can access
// Obj.foo()
// not Obj.bar()
// Obj.INSTANCE.foo()
// Obj.INSTANCE.bar()

/*class A {
    inner object B
}*/
// Modifier 'inner' is not applicable to object
// object is singleton


// nested object
class D {
    object E
}


object SuperComputer {
    @JvmField
    val answer = 4

    // equivalent as follow
    // const val answer = 4
}


// Java can access
// SuperComputer.INSTANCE.getAnswer()
// SuperComputer is kotlin object (= JAVA singleton equivalent)
// ----------------
//
// object SuperComputer {
//   @JvmStatic
//   va answer = 4
// }
// Java can access
// SuperComputer.getAnswer()

fun main(args: Array<String>) {
    println(SuperComputer.answer)
}