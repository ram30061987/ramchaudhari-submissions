class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character> set = new HashSet<>();
        int j = 0, maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }

            set.add(s.charAt(i));
            maxLen = Math.max(maxLen, i - j + 1);
            // j = 1, i = 3 → window = "xyz"
            // Length = 3 - 1 + 1 = 3
            // maxLen = Math.max(2, 3) = 3

        }

        return maxLen;
    }
}


///









