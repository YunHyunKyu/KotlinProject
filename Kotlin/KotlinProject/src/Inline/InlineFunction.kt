package Inline

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) { // crossinline을 사용하면 return을 사용 할 수 없게 된다.
    println("Hello")
    out(a)
    println("GoodBy")
}

fun main() {
    shortFunc(10) {
        println("a: $it")
//        return  // out 함수를 실행하고 shortFunc()를 빠져나오게 된다.
    }
}