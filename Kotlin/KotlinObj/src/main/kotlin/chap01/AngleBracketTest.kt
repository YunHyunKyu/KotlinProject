package chap01

open class A {
    open fun f() = println("A Class f()")
    fun a() = println("A Class a()")
}

interface B {
    fun f() = println("B Interface f()")
    fun b() = println("B Interface b()")
}

class C : A(), B { // 콤마(,)를 사용해 클래스와 인터페이스를 지정, 컴파일되려면 f()가 오버라이딩 되어야 함.
    override fun f() = println("C Class f()")
    fun test() {
        f() // 현재 클래스의 f()
        b() //인터페이스 B의 B
        super<A>.f();
        super<B>.f()
    }
}

fun main() {
    val c = C()
    c.test()
}