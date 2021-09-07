package functionBasic



fun main() {    // 최상위 함수
    val sumFunction = sum(10, 20)
    println(sumFunction)

    val result = max(3, 10);
    println(result)

    outfut("Kyu")

    val result2 = sum(2);
    println(result2)

    val result3 = sum(b = 2);
}

//fun sum(a : Int, b : Int) = a + b
// default 인자.. b : Int = 5
fun sum(a: Int = 5, b : Int = 5) : Int {
    return a + b
}

fun max(a: Int, b: Int) = if(a > b) a else b
//fun max(a: Int, b : Int) : Int {
//    return if (a > b) a else b
//}

// fun output(name : String) = println("Name : $Name")
fun outfut(name : String) : Unit {
    println("Name : $name")
}

