class Solution {
    public int totalFruit(int[] fruit) {
        int l=0;
        int maxlen=0;
        Map<Integer,Integer>count=new HashMap<>();
        for(int r=0;r<fruit.length;r++){
            count.put(fruit[r],count.getOrDefault(fruit[r],0)+1);
            while(count.size()>2){
                int leftval=fruit[l];
                count.put(leftval,count.get(leftval)-1);
                if(count.get(leftval)==0){
                    count.remove(leftval);
                }
                l++;
                
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}
