class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer>mpp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int value=mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],value+1);
        }
        for(Map.Entry<Integer,Integer>it:mpp.entrySet()){
            if(it.getValue()>n/3) ans.add(it.getKey());
        }
        return ans;
        
    }
}