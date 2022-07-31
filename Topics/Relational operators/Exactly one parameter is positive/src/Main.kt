fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    var counter = 0
    if (a >= 1 && b <= 0 && c <= 0) {
        counter++
    } else if (b >= 1 && a <= 0 && c <= 0) {
        counter++
    } else if (c >= 1 && a <= 0 && b <= 0) {
        counter++
    }

    println(counter == 1)

}