class Solution {
    fun solution(s: String): IntArray {
        return s.substring(2 until s.length - 2)
            .split("},{")
            .map { it.split(",").map { it.toInt() } }
            .sortedBy { it.size }
            .fold(setOf<Int>(), {acc, list -> acc.union(list) })
            .toIntArray()
    }
}