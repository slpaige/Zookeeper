const val FOUR = 4

fun main() {
    // put your code here
    val iterations = readln().toInt()

    var max: Int = 0

    repeat(iterations) {
        val input = readln().toInt()
        if (input % FOUR == 0 && input > max) {
            max = input
        }
    }

    println(max)
}