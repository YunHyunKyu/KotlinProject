package standard

fun main() {
    val score: Int? = 32
    //var score = null

    fun checkScore() {
        if(score != null) {
            println("Score: $score")
        }
    }

    // let을 사용해 null 검사를 제거
    fun checkScoreLet() {
        score?.let { println("Score: $it") }
        val str = score.let { it.toString() }
        println(str)
    }

    checkScore()
    checkScoreLet()
}
