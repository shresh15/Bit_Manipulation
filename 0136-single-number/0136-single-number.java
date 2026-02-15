class Solution {
    public int singleNumber(int[] nums) {
        // XOR OPERATION
        
        // a ^ a=0
        //a^0 = a (depends upon a)
        int ans=0;
        for (int i:nums){
            ans=ans ^ i;

        }
        return ans;
        
    }
}