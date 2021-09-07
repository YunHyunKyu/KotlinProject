package recursion

fun main() {
    var number = 4
    val result: Long

    result = factorial(number);
    println("Factorial: $number -> $result")
}

fun factorial(n: Int) : Long {
    return if (n == 1)
        n.toLong()
    else
        n * factorial(n-1)
}