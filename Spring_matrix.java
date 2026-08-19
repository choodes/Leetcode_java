class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int l=0,r=matrix[0].length-1;
        int t=0,b=matrix.length-1;
        List<Integer> list=new ArrayList<>();
        while(l<=r && t<=b){
            for(int i=l;i<=r;i++)
                list.add(matrix[t][i]);
            t++;
            for(int j=t;j<=b;j++)
                list.add(matrix[j][r]);
            r--;
            if(t<=b){
                for(int k=r;k>=l;k--)
                    list.add(matrix[b][k]);
                b--;
            }
            if(l<=r){
                for(int m=b;m>=t;m--)
                    list.add(matrix[m][l]);
            l++;
                    
                
            }
        }
        return list;
        
    }
}
