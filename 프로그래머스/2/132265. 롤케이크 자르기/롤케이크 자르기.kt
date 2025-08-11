class Solution {
    fun solution(topping: IntArray): Int {
        var answer: Int = 0

        var left = hashMapOf<Int,Int>()
        var right = hashMapOf<Int,Int>()

        for (i in topping) {
            right[i] = right.getOrDefault(i, 0) + 1
        }

        for(i in topping) {
            left[i] = left.getOrDefault(i, 0) + 1
            if(right.containsKey(i) && right.get(i) == 1){
                right.remove(i)
            }else{
                right.get(i)?.let { right[i] = it - 1 }
            }

            if(left.size == right.size){ answer ++}
        }

        return answer
    }
}