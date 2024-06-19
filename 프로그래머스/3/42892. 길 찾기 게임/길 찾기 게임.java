import java.util.*;
class Solution {
    
    Node root;
    ArrayList<Integer>  pre;
    ArrayList<Integer>  post;

    public static class Node {
        Node left;
        Node right;
        int idx;
        int x;

    }    
    public int[][] solution(int[][] nodeinfo) {
        int[][] answer = new int[2][];
        var sorted = sort(nodeinfo);


        for (int[] n : sorted) {
            Node newNode = new Node();
            newNode.x = n[0];
            newNode.idx = n[2];

            if(root == null){
                root = newNode;
            }else{

                Node currNode = root;
                while(true){

                    if (currNode.x > n[0]) {

                        if (currNode.left == null) {
                            currNode.left = newNode;
                            break;
                        }

                        currNode = currNode.left;

                    } else {

                        if (currNode.right == null) {
                            currNode.right = newNode;
                            break;
                        }

                        currNode = currNode.right;

                    }

                }



            }



        }
        answer[0] = preOrder(root, new ArrayList<>());
        answer[1] = postOrder(root, new ArrayList<>());
        return answer;
    }


    int[] preOrder(Node node, ArrayList<Integer> i){
        if(node == null){
            return i.stream().mapToInt(Integer::intValue).toArray();
        }
        i.add(node.idx);
        preOrder(node.left,i);
        preOrder(node.right,i);
        return i.stream().mapToInt(Integer::intValue).toArray();
    }

    int[] postOrder(Node node, ArrayList<Integer> i){
        if(node == null){
            return i.stream().mapToInt(Integer::intValue).toArray();
        }
        postOrder(node.left,i);
        postOrder(node.right,i);
        i.add(node.idx);
        return i.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[][] sort(int[][] nodeinfo) {

        int[][] r = new int[nodeinfo.length][3];

        for (int i = 0; i < nodeinfo.length; i++) {
            r[i][0] = nodeinfo[i][0];
            r[i][1] = nodeinfo[i][1];
            r[i][2] = i+1;
        }
        return Arrays.stream(r).sorted(Comparator.comparingInt((int[] e1) -> e1[1]).reversed()).toArray(int[][]::new);
    }
}