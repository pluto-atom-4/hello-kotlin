package week4

open class C(open val value: String) {
    var localValue: String
        private set

    init {
        this.value.length
        this.localValue = this.value.toUpperCase()
    }
}

class B(override val value: String) : C(value)

fun main(args: Array<String>) {
    B("a")

}