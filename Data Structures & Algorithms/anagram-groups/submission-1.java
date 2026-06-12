class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> hm = new HashMap<>();
        for(String str: strs){
       char ch[] = str.toCharArray();
       Arrays.sort(ch);
       String sorted = new String (ch);
       hm.putIfAbsent(sorted, new ArrayList());//act -1
       hm.get(sorted).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
