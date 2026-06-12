class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int temp[] =new int[26];
        Map<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c,map.get(c)-1);
            if(map.get(c)==0) map.remove(c);
        }
        return map.isEmpty();
        // for(int i=0;i<s.length();i++){
        //  if(map.contains(t.charAt(i))){
        //     map.put(map,map.getValue()+1);
        //  }else {
        //     map.put(map.getKey(),1);
        //  }

        // }

    }
}
