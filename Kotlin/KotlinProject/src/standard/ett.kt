package standard

import kotlin.random.Random
import kotlin.system.measureTimeMillis

fun main() {
    val input = "Kotlin"
    val keyword = "in"

    val n = input.indexOf(keyword).takeIf { it >= 0 }?: error("keyword not found")

    val k = input.indexOf(keyword).takeUnless { it < 0 }?: error("keyword not found")

    // 측정 함수
    val executionTime = measureTimeMillis { 
        // 측정할 작업 코드

    }
    println("Execution Time = $executionTime ms");

    // 난수 생성
    val number = Random.nextInt(21)
    println(number);
}