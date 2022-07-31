fun main() {
    // write your code here
    val a: Char = readln().first()

    println(a.isUpperCase() || a.isDigit() && a != '0')
}