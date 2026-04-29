class Solution {
    public int maxArea(int[] nums) {
        // Arrays.sort(nums);
        int max =0;
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int water = Math.min(nums[left],nums[right]) * (right-left);
            max = Math.max(max,water);
            if(nums[left]<nums[right]){
                left++;
            }else{
                right--;
            }
            // left++;
            // right--;
        }
        return max;
    }
    }

