package standard

fun main() {
    // apply와 run 비교
    data class Person(var name: String, var skills : String)
    var person = Person("Kildong", "Kotlin")

    val returnObj = person.apply {
        this.name = "Sean"
        this.skills = "Java"
        "success" // 사용 안됨
    }

    println(person)
    println("returnObj: $returnObj")

    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"
    }
    println(person)
    println("returnObj2 : $returnObj2")
}