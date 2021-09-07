package functionBasic

fun avgFunc(initial: Float = 0f, vararg numbers : Float) : Double{
    var result = 0f;
    for(num in numbers) {
        result += num;
    }

    println("result: $result, numbers.size: ${numbers.size}")

    var avg = initial
    if(numbers.isNotEmpty())  avg += (result / numbers.size) else 0f

    return avg.toDouble();
}

fun main() {
    val result = avgFunc(5f, 100f, 90f, 80f) // 첫번째 인자 : 초기값, 이후 인자는 가변인자
    val result2 = avgFunc(5f);
    println("avg result: $result")
    println(result2);
}