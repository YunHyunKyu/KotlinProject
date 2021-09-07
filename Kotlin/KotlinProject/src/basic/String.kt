fun main() {
    var str1: String = "Hello"
    var str2 = "World"
    var str3 = "Hello"

    println("str === str2: ${str1 === str2}")
    println("str === str3: ${str1 === str3}")

    var a = 1;
    var str4 = "a = $a"
    var str5 = "a = ${a + 2}"

    println("str4: \"$str4\", str5: \"$str5\"");
}
