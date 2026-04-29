class Solution {
    public int trap(int[] nums) {
        int maxleft = 0;
        int maxright = 0;
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;

        while (left < right) {

            if (nums[left] < nums[right]) {
                if (nums[left] >= maxleft) {
                    maxleft = nums[left];
                } else {
                    sum += maxleft - nums[left];
                }
                left++;
            } else {
                if (nums[right] >= maxright) {
                    maxright = nums[right];
                } else {
                    sum += maxright - nums[right];
                }
                right--;
            }
        }

        return sum;
    }
}