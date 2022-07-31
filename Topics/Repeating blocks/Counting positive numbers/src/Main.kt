fun main() {
    // put your code here
    val reps = readln().toInt()
    var posCount = 0

    repeat(reps) {
        val input = readln().toInt()

        if (input > 0) {
            posCount++
        }
    }

    println(posCount)
}