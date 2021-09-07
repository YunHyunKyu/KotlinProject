package basic

fun main() {
    var a : Int?;
    var b : String? = null
    a = 10
    b = "hello"

    println(a)
//  b? =>  b가 혹시라도 null이면 실행하지 않는다. (세이프콜)
//  b!! => null 일리가 없다.
    val len = if(b != null) b.length else -1
    // val len = b?.length ?: -1 위와 같음. (엘비스연산자)
    println("b: $b, length: $len")
}
