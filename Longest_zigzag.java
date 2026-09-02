class Solution {
    int maxzig=0;
    public int longestZigZag(TreeNode root) {
        dfs(root);
        return maxzig;
    }
    public int[] dfs(TreeNode root){
        if(root==null){
            return new int[]{-1,-1};
        }
        int left[]=dfs(root.left);
        int right[]=dfs(root.right);
        int leftlen=1+left[1];
        int rightlen=1+right[0];
        maxzig=Math.max(maxzig,Math.max(leftlen,rightlen));
        return new int[]{leftlen,rightlen};
    }
}
