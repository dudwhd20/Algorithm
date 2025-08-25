class Solution {
    
    fun find(x : Int, parent: IntArray) : Int{
        if(parent[x] != x){
            parent[x] = find(parent[x], parent)
        }
        return parent[x]
    }
    
    fun union(a : Int, b : Int, parent: IntArray){
        var ra = find(a, parent)
        var rb = find(b, parent)
        if(ra != rb) parent[rb] = ra
    }
    
    
    
    fun solution(n: Int, computers: Array<IntArray>): Int {
        val parent = IntArray(n) { it }        
        
        for(i in 0 until n){
            for(j in 0 until n){
                if(computers[i][j] == 1){
                    union(i, j, parent)
                }
            }
        }
        
        val roots = HashSet<Int>()
        
        for(i in 0 until n){
            roots.add(find(i, parent))
        }
        
        return roots.size
    }
}