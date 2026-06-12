class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm = new HashMap<>(nums.length);
        List<Integer>[] freq = new List[nums.length+1];
        // initialize list inside array
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }

        }

        // Step 2: Min-heap by frequency
    // PriorityQueue<Map.Entry<Integer, Integer>> pq =
    //         new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

    // for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
    //     pq.add(entry);
    //     if (pq.size() > k) pq.poll();   // keep only top k
    // }

    // // Step 3: Extract result
    // int[] result = new int[k];
    // int i = 0;
    // while (!pq.isEmpty()) {
    //     result[i++] = pq.poll().getKey();
    // }

    // return result;


        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
