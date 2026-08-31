class Solution {
    private boolean issubtree(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null){
            return false;
        }
        if(p.val!=q.val){
            return false;
        }
        return issubtree(p.left,q.left) && issubtree(p.right,q.right);

    }
    private boolean helpchecker(TreeNode p,TreeNode q){
      if(p==null){
        return false;
      }
      if(issubtree(p,q)){
        return true;
      }
     return  helpchecker(p.left,q) || helpchecker (p.right,q);
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return helpchecker(root,subRoot);
    }
}
