class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }
    int currentNum =0;
    int currentStreak=0;
    int consecutive=0;
    
     for(int num: set){
        if(!set.contains(num-1)){
            currentNum=num;
            currentStreak=1;
        while(set.contains(currentNum+1)){
        currentNum++;
        currentStreak++;
        }
        consecutive= Math.max(consecutive,currentStreak);
     
    }
    }
    return  consecutive;
}
}