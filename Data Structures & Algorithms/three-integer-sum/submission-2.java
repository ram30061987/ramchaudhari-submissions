class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums); // Step 1: Sort the array

        List<List<Integer>> result = new ArrayList<>();

        // We need at least 3 elements, so stop at length - 2
        for (int i = 0; i < nums.length - 2; i++) {

            // Since array is sorted, no triplet can sum to 0 after this
            if (nums[i] > 0) {
                break;
            }

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;        // Need a larger sum
                } else if (sum > 0) {
                    right--;       // Need a smaller sum
                } else {

                    // Found a triplet
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate values for left
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate values for right
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return result;
    }
}