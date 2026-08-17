class Solution {
    public boolean isSubsequence(String s, String t) {
        int c=0,j=0;
        for(int i=0;i<s.length();i++){
        while(j<t.length()){
                if(s.charAt(i)==t.charAt(j)){
                    c++;
                    j++;
                    break;
                }
            j++;
            }
            
        }
        return c==s.length();
    }
}
