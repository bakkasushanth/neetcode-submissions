class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int k : nums){
            if(set.contains(k)){
                return true;
            }else{
                set.add(k);
            }
        }
        return false;
    }
}