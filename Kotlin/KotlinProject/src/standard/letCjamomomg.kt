package standard

fun main() {
    var a = 1;
    var b = 2;

    a = a.let { it + 2}.let {
        println("a = $a")
        val i = it + b
        i
    }
    println(a)

    var x = "Kotlin!"
    x.let { outer ->
        outer.let { inner ->
            print("Inner is $inner and outer is $outer") // 이때는 it를 사용하지 않고 명시적 이름을 사용
        }
    }
}