class Solution {
    public intclass Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int n=people.length-1;
        int p1=0;
        int p2=n;
        Arrays.sort(people);
        while(p1<=p2){
           
            if(p1==p2){
                count++;
                break;
            }
            if(people[p1]+people[p2]<=limit){
                p1++;}
            p2--;
            count++;
        }
        return count;
    }
    }
