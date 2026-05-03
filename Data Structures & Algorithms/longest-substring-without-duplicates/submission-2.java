class Solution {
    public int lengthOfLongestSubstring(String s) {
         if (s == null || s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int maxlen = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (map.containsKey(c)) {
                l = Math.max(l, map.get(c) + 1);
            }

            map.put(c, r);
            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }
}
