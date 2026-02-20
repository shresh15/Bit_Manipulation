class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=0;
        int cnt=0;
        xor=start^goal; // gives the no of unmatched bit as 1 output
        while(xor>0){
            xor=xor &(xor-1);
            cnt++;
        }
        return cnt;

        
    }
}