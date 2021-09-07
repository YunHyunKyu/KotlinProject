package Lambda

fun main() {
//    val result: Int
//
//    val multi = { a: Int, b: Int -> a * b }
//    val multi : (a:Int, b:Int) -> Int = { a, b ->
//        println("$a, $b")
//        a * b
//    }
//
//    result = multi(10, 20)
//    println(result)

//    val nested : () -> Unit = { println("nested") }
    var result = 0;
    var sum = { a: Int, b: Int -> a + b}
    println(sum(10, 20));

    val nestedLambda : (a:Int) -> () -> Unit = {
        {
            println("nestedLambda")
        }
    }
    println(nestedLambda(10) ())

//    val square = { x: Int -> x * x } // 선언 부분을 생략하려면 x의 자료형을 명시해야함.
//    println(square(10))
}