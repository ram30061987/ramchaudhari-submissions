class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm= new HashMap<>();
        for(String str:strs){
            char ch[] =str.toCharArray();
            Arrays.sort(ch);//act,opst,
            String newString= new String(ch);
            if(!hm.containsKey(newString)){
                hm.put(newString,new LinkedList());
            }
            hm.get(newString).add(str);

        }
        return new LinkedList<>(hm.values());
    }
}
