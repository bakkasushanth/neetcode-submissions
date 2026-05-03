class Solution {
    public int maxProfit(int[] nums) {
      int minmax = nums[0];
      int ifsoldtoday = 0;
      int stock = 0;
      if (nums == null || nums.length == 0) return 0;
      for(int i=0;i<nums.length;i++){
        minmax = Math.min(minmax,nums[i]);
        stock=nums[i]-minmax;
        ifsoldtoday = Math.max(ifsoldtoday,stock);
      }
      return ifsoldtoday;
    }
}
