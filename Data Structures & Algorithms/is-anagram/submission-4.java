class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
     Map<Character,Integer> hm = new HashMap<>();
     for(char ch : s.toCharArray()){
       hm.put(ch, hm.getOrDefault(ch,0)+1);
     }

     for(char ch : t.toCharArray()){
        if(!hm.containsKey(ch)){
            return false;
        }else{
        hm.put(ch,hm.get(ch)-1);
        }
        if(hm.get(ch)==0){
            hm.remove(ch);
        }

     }
     return hm.isEmpty();
    }
}













