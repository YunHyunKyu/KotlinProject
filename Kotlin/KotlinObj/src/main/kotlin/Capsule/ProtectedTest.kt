package Capsule

open class Base {
    protected var i = 1
    protected fun protectedFunc() {
        i += 1
        println(i)
    }
    fun access() {
        protectedFunc()
    }
}

class Derived : Base() {
    var j = 1 + i
    fun derivedFunc() : Int {
        protectedFunc()
        return i
    }
}

class Other {
    fun other() {
        val base = Base()
//        base.i = 3  // protected는 상속 계열에서만 접근 가능하다.
    }
}

fun main() {
    val base = Base()
    // 접근 불가
//    base.i
//    base.protecedFunc()
    base.access()

    val derived = Derived()
    derived.j = 3;
    derived.derivedFunc()
}