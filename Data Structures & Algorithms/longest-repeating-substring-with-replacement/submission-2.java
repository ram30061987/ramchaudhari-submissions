class Solution {
    public int characterReplacement(String s, int k) {
       int[] count = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Current character ka count increase karo
            int index = s.charAt(right) - 'A';
            count[index]++;

            // Maximum frequency update karo
            maxFrequency = Math.max(maxFrequency, count[index]);

            // Window ki length
            int windowLength = right - left + 1;

            // Kitne characters replace karne padenge
            int replacementsNeeded = windowLength - maxFrequency;

            // Agar replacements k se zyada hain
            while (replacementsNeeded > k) {

                int leftIndex = s.charAt(left) - 'A';
                count[leftIndex]--;

                left++;

                windowLength = right - left + 1;
                replacementsNeeded = windowLength - maxFrequency;
            }

            // Maximum valid window
            maxLength = Math.max(maxLength, windowLength);
        }

        return maxLength;
    }
}
