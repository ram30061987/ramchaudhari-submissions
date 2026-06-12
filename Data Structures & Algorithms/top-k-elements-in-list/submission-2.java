class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
            }else{
                hm.put(nums[i],1);
            }
            
        }
        System.out.print(" values "+hm);
        PriorityQueue<Map.Entry<Integer,Integer>> pq= new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(hm.entrySet());
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=pq.poll().getKey();
        }
        return result;
    }
}
