class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[1],b[1]));
        int c=0;
        int prevright=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(prevright<pairs[i][0]){
                c++;
                prevright=pairs[i][1];
            }

        }
        return c+1;
    }
}
