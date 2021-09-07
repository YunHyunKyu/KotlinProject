package standard

fun main() {
    data class Person(var name: String, var skills : String)
    var person = Person("Kildong", "Kotlin")
    
    val a = person.let { 
        it.skills = "Android"
        "success" // 마지막 문장의 결과를 반환
    }

    println(a)
    println(person.skills)

    val b = person.also {
        it.skills = "java"
        "sucess" // 마지막 문장은 사용되지 않음.
    }

    println(person)
    println("b: $b")
    
}