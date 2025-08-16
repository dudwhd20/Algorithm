import java.util.*;
class Solution {
   class Truck(var weight: Int) {
        var move = 1
    }

    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        var waitQue: Queue<Truck> = LinkedList()
        var moveQue: Queue<Truck> = LinkedList()
        var curr_weight = 0

        for (i in truck_weights) {
            waitQue.offer(Truck(i))
        }

        while (moveQue.isNotEmpty() || waitQue.isNotEmpty()) {
            answer++

            if(moveQue.isEmpty()) {
                var t = waitQue.poll()
                curr_weight += t.weight
                moveQue.offer(t)
                continue
            }

            moveQue.forEach { it.move++ }

            if(moveQue.peek().move > bridge_length) {
                curr_weight -= moveQue.poll().weight
            }

            if(waitQue.isNotEmpty() && waitQue.peek().weight + curr_weight <= weight) {
                var t = waitQue.poll()
                curr_weight += t.weight
                moveQue.offer(t)
            }
        }

        return answer
    }
}