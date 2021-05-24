package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val arr = mutableListOf<String>()

        for (el in inputString.indices) {
            when (inputString[el]) {
                '<' -> {
                    var str = ""
                    for (i in el + 1..inputString.length) {
                        if (inputString[i] == '>') {
                            arr.add(str)
                            str += inputString[i]
                            for (j in i + 1 until inputString.length) {
                                if (inputString[j] == '<') {
                                    break
                                } else if (inputString[j] == '>') {
                                    arr.add(str)
                                    str += inputString[j]
                                } else str += inputString[j]
                            }
                            break
                        } else str += inputString[i]
                    }
                }
                '[' -> {
                    var str = ""
                    for (i in el + 1..inputString.length) {
                        if (inputString[i] == ']') {
                            arr.add(str)
                            str += inputString[i]
                            for (j in i + 1 until inputString.length) {
                                if (inputString[j] == ']') {
                                    arr.add(str)
                                    str += inputString[j]
                                } else if (inputString[j] == '[') {
                                    break
                                } else str += inputString[j]
                            }
                            break
                        } else str += inputString[i]
                    }
                }
                '(' -> {
                    var str = ""
                    for (i in el + 1..inputString.length) {
                        if (inputString[i] == ')') {
                            arr.add(str)
                            str += inputString[i]
                            for (j in i + 1 until inputString.length) {
                                if (inputString[j] == ')') {
                                    arr.add(str)
                                    str += inputString[j]
                                } else if (inputString[j] == '(') {
                                    break
                                } else str += inputString[j]
                            }
                            break
                        } else str += inputString[i]
                    }
                }
            }
        }
        return arr.toTypedArray()
    }
}
