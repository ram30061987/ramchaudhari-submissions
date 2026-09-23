class Solution {
    public int longestConsecutive(int[] nums) {
    Set<Integer> set = new HashSet<>();
    int currentStreak=0,longest=0,currentNum=0;

    for (int num:nums){
      set.add(num);
    }
    for(int num : set){
      if(!set.contains(num-1)){
         currentNum=num;
         currentStreak=1;

      while(set.contains(currentNum+1)){
         currentNum++;
         currentStreak++;
      }
         longest=Math.max(longest,currentStreak);
      }
      }
      return longest;
      }
        
    }







