class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        // int[] arr = new int[nums.length - k + 1];

        // for (int i = 0; i <= nums.length - k; i++) {

        //     int max = Integer.MIN_VALUE;

        //     for (int j = i; j < i + k; j++) {
        //         max = Math.max(nums[j], max);
        //     }

        //     arr[i] = max;
        // }

        // return arr;


     int[] arr = new int[nums.length - k + 1];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int i = 0;
        while (i < k) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            i++;
        }
        arr[0] = map.lastKey();
     while (i < nums.length) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            
            int remove = nums[i - k];
            map.put(remove, map.get(remove) - 1);
            if (map.get(remove) == 0) {
                map.remove(remove);
            }

            arr[i - k + 1] = map.lastKey();
            i++;
        }

            return arr;

    }
    
    }
