class Solution {
    fun solution(s: String): IntArray {
        var tryCount = 0
        var zeroCount = 0
        var str = s

        while (str != "1") {
            zeroCount +=  str.chars().filter { e -> e == '0'.code }.count().toInt()

            str = str.replace("0","")

            str = Integer.toBinaryString(str.length)

            tryCount++
        }

        return intArrayOf(tryCount,zeroCount)
    }
}