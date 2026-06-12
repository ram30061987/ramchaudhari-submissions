class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        Map<String,List<String>> hm = new HashMap<>();
         for(String str : strs){
           char ch[]= str.toCharArray();
            Arrays.sort(ch);
           String newString = new String(ch);
           hm.putIfAbsent(newString,new ArrayList());
           hm.get(newString).add(str);
         }
         return new ArrayList(hm.values());
    }
}
