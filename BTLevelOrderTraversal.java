package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BTLevelOrderTraversal {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int val) { this.val = val; }
		TreeNode (int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Solution {
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        
	        List<List<Integer>> ans = new ArrayList<>();
	        if (root == null) return ans;
	        LinkedList<TreeNode> childQueue = new LinkedList<>();
	        childQueue.add(root);
	            while (!childQueue.isEmpty())
	            {
	                List<Integer> level = new ArrayList<>();
	                LinkedList<TreeNode> queue = childQueue;
	                childQueue = new LinkedList<>();
	                while (!queue.isEmpty()) {
	                    TreeNode node = queue.remove();
	            
	                    if (node != null)
	                        level.add(node.val);
	                    if (node.left != null)    
	                        childQueue.add(node.left);
	                    if (node.right != null)
	                        childQueue.add(node.right);
	                }    
	                    if (level.size() > 0)
	                        ans.add(level);
	            }

	            return ans;
	    }
	}
}
