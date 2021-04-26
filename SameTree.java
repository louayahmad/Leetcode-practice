package LeetcodeEasy;

import java.util.LinkedList;
import java.util.Queue;



public class SameTree {
	
	public class TreeNode {
		int val;     
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {		
		this.val = val;	
		this.left = left;	
		this.right = right;
		
		}
		
	}
	public boolean isSameTree(TreeNode p, TreeNode q) {  
        Queue<TreeNode> queue = new LinkedList<>();  
        if (p == null && q == null) return true; 
        else if(p == null || q== null) return false;     
        if (p != null && q != null) {
            queue.offer(p);
            queue.offer(q);
        }
        while(!queue.isEmpty()) {
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();
            if(first == null && second == null) continue;
            if (first == null || second == null) return false;
            if (first.val != second.val) return false;
            queue.offer(first.left);
            queue.offer(second.left);
            queue.offer(first.right);
            queue.offer(second.right);               
        }        
        return true;
    }

}
