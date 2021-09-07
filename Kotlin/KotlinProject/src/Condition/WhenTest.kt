package Condition

fun main() {
    print("Enter the score: ")
//     readLine => 코틀린 io의 표준 함수인 readline()은 콘솔로 부터 한 줄 입력을 받아들입니다.
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'

    // 인자가 있는 when
    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        else -> grade = 'F'
    }
    // 인자가 없는 when
    when {
        score >= 90.0 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        else -> grade = 'F'
    }

    println("score: $score, grade: $grade")
}