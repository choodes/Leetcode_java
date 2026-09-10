class Solution {
    public int findMinArrowShots(int[][] points) {
        int l=points.length;
       Arrays.sort(points, (a,b) -> Integer.compare(a[1], b[1]));
        int prevarr=points[0][1];
        int c=1;
        for(int i=1;i<l;i++){
            if(prevarr>=points[i][0]){
            continue;
            }
        
        c++;
            prevarr=points[i][1];
        }
        return c;
    }
}
