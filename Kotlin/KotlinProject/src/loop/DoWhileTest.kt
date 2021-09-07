package loop

fun main() {
    do {
        print("Enter the number: ")
        var input = readLine()!!.toInt()

        for(i in 0 until input) { // until => input 전까지
            for(j in 0..(input-1)) {
                print((i + j) % input + 1)
            }
            println()
        }

    } while(input != 0)
}