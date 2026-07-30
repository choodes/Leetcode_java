class Solution {
    public boolean isAnagram(String s, String 
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer>map=new HashMap<>();
    
    for(int i=0;i<s.length();i++){
    if(map.containsKey(s.charAt(i))){
        int freq=map.get(s.charAt(i));
        map.put(s.charAt(i),++freq);
    }
            else{
                map.put(s.charAt(i),1);
            }
    }
for(int i=0;i<t.length();i++){
    
    if(map.containsKey(t.charAt(i))){
        int freq=map.get(t.charAt(i));
        map.put(t.charAt(i),--freq);
    }
            else{
                map.put(t.charAt(i),1);
            }
}
for(int i=0;i<t.length();i++){
if(map.get(s.charAt(i)) !=0) {return false;}
    
}
return true;
}}
