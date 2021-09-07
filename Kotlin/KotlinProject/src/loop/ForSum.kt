package loop

fun main() {
    var sum = 0
    for (i in 1..5) {
        sum += i;
    }

    println(sum)

    // 하행 반복 - downTo => 5..1은 잘못된 사용(아무것도 출력 X)
    for(i in 5 downTo 1)
        sum += i;

    println(sum);

    // 필요한 단계 증가 - step
    for (i in 1..5 step 2) print("i : $i, ");

    println();

    // 혼합 사용  5 3 1
    for(i in 5 downTo 1 step 2) print("i : $i, ");
}