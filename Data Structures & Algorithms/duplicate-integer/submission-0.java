class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<>(); 
        for(int num:nums){
            if(sets.contains(num)){return true;}
             sets.add(num);
        }
        return false;
 
    }
}
