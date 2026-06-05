class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int n=matrix.length;
        int m=matrix[0].length;
        
        for(int i=0;i<n;i++){
            if(search(matrix[i],target) ==true) return true;
        }
        return false;
        
        // code here
    }
    
    public boolean search(int[]arr,int x){
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x) return true;
            else if(arr[mid]<x) low=mid+1;
            else high=mid-1;
        }
        return false;
    }
    
}