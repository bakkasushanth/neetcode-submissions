
      class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map1 = new HashMap<>();

        int i = 0;

        // frequency map for s1
        while (i < s1.length()) {
            map.put(s1.charAt(i),
                    map.getOrDefault(s1.charAt(i), 0) + 1);
            i++;
        }

        int left = 0;
        int k = s1.length();

        for (int right = 0; right < s2.length(); right++) {

            // add current character to window map
            char ch = s2.charAt(right);

            map1.put(ch,
                    map1.getOrDefault(ch, 0) + 1);

            // maintain window size
            if (right - left + 1 > k) {

                char remove = s2.charAt(left);

                map1.put(remove, map1.get(remove) - 1);

                if (map1.get(remove) == 0) {
                    map1.remove(remove);
                }

                left++;
            }

            // compare maps
            if (map.equals(map1)) {
                return true;
            }
        }

        return false;
    }
}

