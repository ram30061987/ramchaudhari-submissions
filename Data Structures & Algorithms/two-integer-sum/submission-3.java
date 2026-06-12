class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        int targetSum=0;
        for(int i =0;i<nums.length;i++){
          targetSum=target-nums[i];
          if(hm.containsKey(targetSum)){
            return new int[]{hm.get(targetSum),i};
          }else{
          hm.put(nums[i],i);
          }
          
        }
        return new int[]{};
    }
}
