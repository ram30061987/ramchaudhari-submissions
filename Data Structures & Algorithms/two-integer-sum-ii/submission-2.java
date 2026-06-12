class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int sum =target-numbers[i];
            if(hm.containsKey(sum)){
                //hm.put(numbers[i],hm.getOrDefault(sum));
               return new int[]{hm.getOrDefault(sum,0),i+1};
            }else{
                hm.put(numbers[i],i+1);
            }

        }
        return new int[0];
    }
}

//public class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         int l = 0, r = numbers.length - 1;

//         while (l < r) {
//             int curSum = numbers[l] + numbers[r];

//             if (curSum > target) {
//                 r--;
//             } else if (curSum < target) {
//                 l++;
//             } else {
//                 return new int[] { l + 1, r + 1 };
//             }
//         }
//         return new int[0];
//     }
// }