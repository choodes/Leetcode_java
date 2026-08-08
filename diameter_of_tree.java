class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        diametertree(root);
        return max;
    }
   private int  diametertree(TreeNode root){
        if(root==null){
            return 0;
        }
     int lf=diametertree(root.left);
        int rg=diametertree(root.right);
       max=Math.max(max,lf+rg);
        return 1+Math.max(lf,rg);
        
        
    }
}