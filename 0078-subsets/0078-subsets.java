class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        int len =nums.length;
        int sublength=(1<<len);
        for(int i=0;i<sublength;i++){
            // creating an arraylist for storing
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<len;j++){
                if((i & (1<<j))!=0) arr.add(nums[j]);
                
            }
            res.add(arr);
        }
        return res;
    }
}