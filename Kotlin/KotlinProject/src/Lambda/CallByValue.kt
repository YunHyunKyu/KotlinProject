package Lambda

fun main() {
    val result = callByValue(lambda()) // 람다식 함수 호출
    println(result)
}

fun callByValue(b: Boolean) : Boolean {
    println("CallByValue function")
    return b
}

val lambda: () -> Boolean = {
    println("lambda function")
    true
}
