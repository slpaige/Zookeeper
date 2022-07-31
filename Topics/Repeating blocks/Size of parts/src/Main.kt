fun main() {
    // put your code here
    val numParts = readln().toInt()
    var perfects = 0
    var largers = 0
    var rejections = 0

    repeat(numParts) {
        val component = readln().toInt()

        if (component == 0) {
            perfects++
        } else if (component == 1) {
            largers++
        } else {
            rejections++
        }
    }

    print("$perfects $largers $rejections")
}