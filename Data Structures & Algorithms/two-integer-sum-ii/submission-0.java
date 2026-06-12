class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int sum =target-numbers[i];
            if(hm.containsKey(sum)){
                //hm.put(numbers[i],hm.getOrDefault(sum));
               return new int[]{hm.get(sum),i+1};
            }else{
                hm.put(numbers[i],i+1);
            }

        }
        return new int[0];
    }
}
