//package chap01
//
// constructor 생략 가능
//class Bird constructor(name:String, wing:Int, beak:String) {
//class Bird (var name:String, var wing:Int, var beak:String) {
//     프로퍼티
//    var name: String = name;
//    val wing: Int = wing;
//    var beak: String = beak;
//
//    constructor(name:String, wing: Int, beak:String) { // 부 생성자
//        this.name = name;
//        this.wing = wing;
//        this.beak = beak;
//    }
//
//     생성자에 코드 처리 하고 싶을 때 init
//    init {
//        println("----------init start-----------")
//        name = name.capitalize();
//        println("name: $name, wing: $wing, beak: $beak")
//        println("----------init end-------------")
//    }
//
//
//    // 메서드
//    fun fly() {
//        println("Fly")
//    }
//}
//
//fun main() {
//    val coco = Bird("coco", 2, "long");
//
//    coco.fly()
//
//    println(coco.name)
//    println(coco.wing)
//    println(coco.beak)
//}