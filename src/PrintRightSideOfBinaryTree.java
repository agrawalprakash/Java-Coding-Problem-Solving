package src;

import java.util.*;

class TreeNode {
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
 
class PrintRightSideOfBinaryTree {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> answerList = new ArrayList<>();

        if (root == null) {
            return answerList;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
       

        while (q.size() > 0) {

           int count = q.size();
        

            while (count-- > 0) {

                TreeNode node = q.remove();

                if (count == 0) {
                    answerList.add(node.val);
                }

                if (node.left != null) {
                    q.add(node.left);
                }

                if (node.right != null) {
                    q.add(node.right);
                }

        }

        }

        return answerList;
    }
}