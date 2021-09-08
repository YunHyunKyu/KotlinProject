package Overloading_Override

fun main() {
    val calc = Calc();
    println(calc.add(3,2));
    println(calc.add(3.1, 5.6));
    println(calc.add(2, 2, 3));
    println(calc.add("하잉", "안녕"))
}

class Calc {
    fun add(x : Int, y : Int) : Int = x + y;
    fun add(x : Double, y : Double) : Double = x + y;
    fun add(x : Int, y : Int, z : Int) : Int = x + y + z;
    fun add(x : String, y : String) : String = x + y;
}