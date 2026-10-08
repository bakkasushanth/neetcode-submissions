class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        // int maxNums = 0;
        // for(int k : nums){
        //     maxNums = Math.max(k,maxNums);
        // }
        // for(int k=1;k<=maxNums;k++){
        //     int hours = 0;
        //     for(int num : nums){
        //         hours += (num+k-1)/k;
        //     }
        //     if(hours<=h){
        //         return k;
        //     }
        // }
        // return maxNums;

        int lo = 1;
        int hi =0;
        for(int k: nums){
            hi = Math.max(hi,k);
        }
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(canFinish(nums,mid,h)){
                hi = mid;
            }else{
                lo=mid+1;
            }
        }
        return lo;


    }
            
        }


         private boolean canFinish(int[] piles, int k, int h) {
        int hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k;  
        }
        return hours <= h;
         }

    
