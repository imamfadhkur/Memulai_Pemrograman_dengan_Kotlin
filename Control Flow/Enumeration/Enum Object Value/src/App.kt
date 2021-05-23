// main function
fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.CYAN
    val colorBlue = Color.BLUE

    println(colorRed)
    println(colorGreen)
    println(colorBlue)
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    CYAN(0x00FFDD),
    BLUE(0x0000FF)
}