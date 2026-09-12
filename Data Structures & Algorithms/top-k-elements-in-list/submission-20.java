class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> hm = new HashMap<>();
     for(int num : nums){
      hm.put(num, hm.getOrDefault(num,0)+1); //1-1,2-2,3-3
     }
    PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
 for(Map.Entry<Integer,Integer> hmm : hm.entrySet()){
    pq.add(hmm);  //1-1,2-2,3,3
 
    if(pq.size()>k){
        pq.poll();  //now remaining 2-2,3-3
    }
 }
   int result[] = new int[k];
  for(int i=0;i<k;i++){
      result[i] = pq.poll().getKey();
  }
   return result;
    }
    
}










