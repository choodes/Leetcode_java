class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int []>list=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<firstList.length && j<secondList.length){
            int prevstart=Math.max(firstList[i][0], secondList[j][0]);
            int prevend=Math.min(firstList[i][1], secondList[j][1]);
            if(prevstart<=prevend){
                list.add(new int[]{prevstart,prevend});}
                if(firstList[i][1]<secondList[j][1])i++;
                else{
                    j++;
                }
            
            
        }
     return list.toArray(new int[0][]);
    }
}
