package functionBasic

fun normalVarargs(vararg a: Int) {
    for(num in a) {
        print("$num ")
    }
}

fun main() {
    normalVarargs(1)

    normalVarargs(1, 2, 4, 6, 8, 9)
}