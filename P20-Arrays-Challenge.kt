fun main() {
    println(max(arrayOf(45, 48, 78, 15, 1, 54, 12, 0, 35)))
    println(min(arrayOf(45, 48, 78, 15, 1, 54, 12, 0, 35)))
}

fun max(values: Array<Int>): Int {
    var max = values[0]
    for (value in values) {
        if (value > max) {
            max = value
        }
    }
    return max
}

fun min(values: Array<Int>): Int {
    var min = values[0]
    for (value in values) {
        if (value < min) {
            min = value
        }
    }
    return min
}