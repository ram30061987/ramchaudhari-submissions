class Solution {
    public int[] twoSum(int[] nums, int target) {
        int targetSum=0;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            targetSum=target-nums[i];
            if(hm.containsKey(targetSum)){
            return new int[]{hm.get(targetSum),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}
