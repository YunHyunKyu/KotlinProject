package loop

fun main() {
//    var total = 0;
//
//    for(num in 0..99 step 2) { // 짝수 합
//        total += num;
//    }
//
//    println("total : $total")
    labelBreak()
}

fun labelBreak() {
    println("labelBreak")
    first@ for(i in 1..5) {
        second@ for(j in 1..5) {
            if(j == 3)
                break@first
            println("i: $i, j: $j")
        }
        println("After for j")
    }
    println("After for i")
}