package src;
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
 
class CheckIfValidBST {
    public boolean isValidBST(TreeNode root) {
        
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    private boolean isValid(TreeNode node, long start, long end) {

        if (node == null) {
            return true;
        }

        if (start < node.val && node.val < end) {


            return isValid(node.left, start, node.val) 
                    && isValid(node.right, node.val, end);

        }

        return false;

    }
}