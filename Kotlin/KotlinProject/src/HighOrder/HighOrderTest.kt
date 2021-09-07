package HighOrder

fun highFun(a : Int, b : Int, sum: (Int, Int) -> Int) : Int {
    return sum(a, b)
}

fun sum(x: Int, y:Int) = x + y

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int) : Int {
    return c(a, b)
}

fun main() {
    var result = highFun(1, 3) {x, y ->
        x + y
    }
    println(result)

    funcParam(3, 2, ::sum)
}