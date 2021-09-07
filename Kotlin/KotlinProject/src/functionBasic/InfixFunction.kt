package functionBasic

fun main() {
//    val multi = 3.multiply(10);

    // 중위 표현법
    val multi = 3 multiply 10
    println("multi: $multi")

    val num = 3
//    val str = num.strPlus("Kotlin")

//    중위 표현법
    val str = num strPlus "Kotlin"
    println(str)
}

infix fun Int.multiply(x: Int) : Int {
    return this * x;
}

infix fun Int.strPlus(x: String) : String {
    return "$x version $this"
}