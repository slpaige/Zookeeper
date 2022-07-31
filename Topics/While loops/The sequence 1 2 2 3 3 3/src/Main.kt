fun main() {
    // put your code here
    val input = readln().toInt()
    var whichNumber = 1
    var totalLength = 1

    while (totalLength <= input) {
        repeat(whichNumber) {
            if (totalLength <= input) {
                print("$whichNumber ")
                totalLength++
            }
        }
        whichNumber++
    }
}