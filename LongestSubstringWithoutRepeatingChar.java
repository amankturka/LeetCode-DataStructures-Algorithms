
//Problem 3. Longest Substring Without Repeating Characters
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // similar to sliding window problems
        // find longest substring without repeating char

        /*
         * Algorithm: -take two var i=0 and j=0 -while i and j are less than length of
         * string - fix i - Hashset to store character in current window i=j initialy -
         * look for repeating char - if non-repeating char - move j and add j or
         * elements to set - increment j - keep track of length of max substing (j-i) -
         * if repeating char - remove i from the hash set - increment i -return result
         */

        int sLength = s.length();
        HashSet<Character> set = new HashSet<>();
        int longestLength = 0;
        int i = 0, j = 0;
        while (i < sLength && j < sLength) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                longestLength = Math.max(longestLength, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return longestLength;
    }
}