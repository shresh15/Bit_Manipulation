class Solution {
    public int[] singleNumber(int[] nums) {
        //approach: Divide the array into 2 parts: one contains one single number, another contains another single no.
        int xor=0;
        for(int num:nums){
            xor=xor ^num;
        }
            //get the rightside set bit
            int rsb=xor & (-xor); 
            int xorA=0,xorB=0;

            for(int num:nums){
                if((num & rsb) !=0) // if bit is set
                xorA=xorA^num; else xorB=xorB^num;
            }

            return new int[]{xorA,xorB};
        }
        
    }
