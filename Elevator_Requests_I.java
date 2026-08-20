class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int currfloor=0;
        int total =0;
        
        for(int i=0;i<requests.length;i++){
            total+=Math.absolute(currfloor-requests[i]);
        }
        return total;
    }
}
