fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.

    val first = numbers.first()
    val last = numbers.last()
    val lastIndex = numbers.lastIndex

    numbers[0] = last
    numbers[lastIndex] = first

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}