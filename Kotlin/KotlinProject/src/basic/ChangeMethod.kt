@file:Suppress("DEPRECATED_IDENTITY_EQUALS")

package basic

fun main() {
    val a : Int = 1;
//    val b : Double = a; // 자료 불일치
//    val c: Int = 1.1    // 자료 불일치

    // 변환 메서드
    val b : Double = a.toDouble(); // 사용
    val result = 1L + 3 // Long + Int -> result는 Long

    println(b);
    println(result);

//    == 값만 비교
//    === 값과 참조 주소를 비교할 때
    val a2 : Int = 123;
    val b2 : Int = 123;
    println(a2 == b2);
    println(b2 === a2);

    val a3 : Int = 128
    val b3 : Int? = 128
    println(a3 == b3);
    println(b3 === a3);
}