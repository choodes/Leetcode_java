class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int l=intervals.length;
        int c=0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int prevend=intervals[0][1];
        for(int i=1;i<l;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(start<prevend){
                c++;
            }
            else{
                prevend=end;
            }
        }
        return c;
    }
}
