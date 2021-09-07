package basic

fun main() {
    // 스마트 캐스트 사용
    var test : Number = 12.2
    println("$test")

    test = 12
    println("$test")

    test = 120L
    println("$test")

    test += 12.1f
    println("$test")

    // is 키워드 사용한 검사
    val num = 256

    if(num is Int) {
        println(num)
    } else if(num !is Int) {
        println("Not a Int")
    }

    // Any
    // 자료형이 정해지지 않은 경우
    // 모든 클래스의 뿌리 - Int나 String은 Any형의 자식 클래스이다.
    // Any는 언제든 필요한 자료형으로 자동 변환 (스마트 캐스트)

    var a : Any = 1
    a = 20L
    println("a: $a type: ${a.javaClass}")

    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x: Any) {
    if(x is String) {
        println("x is String: $x");
    }
    if(x is Int) {
        println("x is Int: $x");
    }
}