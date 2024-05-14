public class Solution {
    public static int binarySearchClosest(int []nums, int left, int right, int target) {
        //Your code goes here
        int ans=-1;
        int l=left;
        int r=right;
        
        while (l<=r){
            int mid=(l+r)/2;
            if (nums[mid]==target){
                ans=mid;
                break;
            }
            if (nums[mid]>target){
                r=mid-1;
            }
            if (nums[mid] < target){
                l=mid+1;
            }
        }
        if (ans !=-1){
            return ans;
        }
        else if (l==nums.length){
            return right;
        }
        else {
            int q=Integer.MAX_VALUE;
            int p=Integer.MAX_VALUE;
        
            
            p=nums[l]-target;
            if (l>=1)
                q=target-nums[l-1];
            if (Math.abs(p)<Math.abs(q)){
                return l;
            }
            else{
                return l-1;
            }
        }
        
    }

}