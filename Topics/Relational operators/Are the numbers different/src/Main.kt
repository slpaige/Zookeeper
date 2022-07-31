fun main() {
    // put your code here
    val inp1 = readln().toInt()
    val inp2 = readln().toInt()
    val inp3 = readln().toInt()

    val areDiff = inp1 != inp2 && inp2 != inp3 && inp3 != inp1

    println(areDiff)
}