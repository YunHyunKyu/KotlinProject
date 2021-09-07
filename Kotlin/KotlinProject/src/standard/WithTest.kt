package standard

fun main() {
    data class User(val name: String, var skills: String, var email: String? = null)

    var user = User("Kildong", "default");

    val result = with (user) {
        skills = "Kotlin"
        email = "kildong@example.com"
        email
    }

    println(user)
    println("result: $result")
}