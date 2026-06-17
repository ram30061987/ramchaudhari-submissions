class Solution {
   public int[] twoSum(int[] numbers, int target) {
//1-indexed) means Array indices not java indices
    int left = 0;
    int right = numbers.length - 1;
//two pointer approach if array is sorted 
    while(left < right) {
        int sum = numbers[left] + numbers[right];
        if(sum == target) {
            return new int[]{left + 1, right + 1};
        }
        else if(sum < target) {
            left++;
        }
        else {
            right--;
        }
    }

    return new int[]{};
}
}

//Time  : O(n)
//Space : O(1)