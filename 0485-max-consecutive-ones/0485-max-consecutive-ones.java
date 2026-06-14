class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt=0;
        int cntmax=0;
        for (int i=0;i<nums.length;i++){
           
            if(nums[i]==1)
            cntmax=Math.max(++cnt,cntmax);
            else cnt=0;
        }
        return cntmax;
    }
}