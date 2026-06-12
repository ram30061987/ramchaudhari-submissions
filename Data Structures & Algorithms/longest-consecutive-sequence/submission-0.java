class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0 || nums==null) return 0;
        Set<Integer> set= new HashSet<>();
        int prevElement=1;
        int start=nums[0];
        int count=0;
        for(int i=0;i<nums.length;i++){
         set.add(nums[i]);
         }
         int longestStreak=0;
         for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int currentStreak=1;
                //next element check
                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
         }
          return longestStreak;
        }
       
    }
