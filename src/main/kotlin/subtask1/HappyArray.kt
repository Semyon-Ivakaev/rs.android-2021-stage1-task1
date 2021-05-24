package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val copy = sadArray.toMutableList()
        var n = 1
        while (n < copy.size - 1) {
            if (n != 0 && copy[n] > copy[n + 1] + copy[n - 1]) {
                copy.removeAt(n)
                n--
            } else {
                n++
            }
        }

        return copy.toIntArray()
    }
}
