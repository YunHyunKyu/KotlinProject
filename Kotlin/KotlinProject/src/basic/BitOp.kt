package basic

fun main() {
    val x = 4; // 10 0100(2)
    val y = 0b000_1010 // 5(10)
    val z = 0x0f // 0b0000_1111(2) 15(10)

    println("x shl 2 -> ${x shl 2 }")
    println("x inv -> ${x.inv()}")
    println("y shr 2 -> ${y.shr(2)}")
}