package Capsule

// 기본은 public

private class PrivateTest {
    private var i = 1
    private fun privateFunc() {
        i += 1
        println(i);
    }

    fun access() { // public
        privateFunc()
    }
}

class OtherClass {
    // val pc = PrivateTest() // 공개 생성 불가
    fun test() {
        val pc = PrivateTest()
        pc.access()
    }
}

fun main() {
    val pc = PrivateTest() // 최상위 함수에서는 private 클래스 객체를 생성할 수 있다.
//    pc.i = 3 // 접근 불가
//    pc.privateFunc();  // 접근 불가
    pc.access();
}

fun topFunction() {
    val pc = PrivateTest();
}
