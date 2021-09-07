package Lambda

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean) : Boolean {
    println("CallByName function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("otherLambda function")
    true
}