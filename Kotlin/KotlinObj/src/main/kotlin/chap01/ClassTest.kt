class Car {
    val wheel: Int;
    var name: String;

    constructor(wheel:Int, name:String) {
        this.wheel = wheel;
        this.name = name;
    }
    
    fun start() {
        println("Engine Start")
    }
}

class Bird {}

fun main() {
    val sonata: Car = Car(4, "소나타");

    println(sonata.wheel)
    sonata.start()
}
