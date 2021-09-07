package Closure

fun main() {
    val calc = Calc()
    var result = 0
    calc.addNum(2,3) { x, y -> result = x + y } // 클로져
    println(result)

    filteredNames(4)
}

fun filteredNames(length: Int) {
    val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
    val filterResult = names.filter {
        it.length == length;
    }
    println(filterResult)
}

class Calc {
    fun addNum(x: Int, y: Int, add: (Int, Int)-> Unit) {
        add(x, y)
    }
}