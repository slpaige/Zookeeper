fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(a >= b.coerceAtMost(c) && a <= b.coerceAtLeast(c))

}