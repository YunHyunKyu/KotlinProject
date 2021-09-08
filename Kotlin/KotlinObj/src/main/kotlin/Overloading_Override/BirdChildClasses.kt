package chap01

open class Bird(var name: String, var wing: Int, var beak: String) {
    open fun fly() {
        println("Fly")
    }
}

class Lark(name: String, wing: Int, beak: String) : Bird(name, wing, beak) {

    override fun fly() {
        println("Quick Fly")
    }

    fun singHitone() {
        println("sing Hitone");
    }
}

class Parrot : Bird {
    var language: String

    constructor(name: String, wing: Int, beak: String, language: String) : super(name, wing, beak) {
        this.language = language;
    }

    override fun fly() {
        println("slowFly")
        super.fly()
    }


    fun speek() {
        println("Speek: $language")
    }
}

fun main() {
    val lark : Bird = Lark("myLark", 2, "short");
    val parrot : Bird = Parrot("myparrot", 2, "long", "English");

    println("lark - name: ${lark.name} ")
//    println("parrot - name: ${parrot.name}, lang : ${parrot.language}")

//    lark.singHitone()
    lark.fly()

//    parrot.speek()
    parrot.fly()
}

