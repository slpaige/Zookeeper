import java.util.*

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    var maxValue = Int.MIN_VALUE
    var position = 0
    var index = 1

    while(scanner.hasNextInt()){
        val new = scanner.nextInt()
        if(maxValue < new){
            maxValue = new
            position = index
        }
        index++
    }

    print("$maxValue $position")

}