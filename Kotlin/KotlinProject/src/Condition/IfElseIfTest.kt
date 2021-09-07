package Condition

fun main() {
    print("Enter the score: ")
//     readLine => 코틀린 io의 표준 함수인 readline()은 콘솔로 부터 한 줄 입력을 받아들입니다.
    val score = readLine()!!.toDouble()

    var grade: Char = 'F'

    if(score >= 90.0) {
        grade = 'A';
    } else if(score in 80.0..89.9) {
        grade = 'B'
    } else if(score in 70.0..79.9) {
        grade = 'C'
    } else if(score >= 60 && score <= 69.9) {
        grade = 'D'
    } else {
        grade = 'F'
    }

    println("score: $score, grade: $grade")
}