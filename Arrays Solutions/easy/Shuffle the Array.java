https://leetcode.com/problems/shuffle-the-array/description/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int start=0,end=n,one=0;
        int[] ret=new int[nums.length];
        while(start<n){
            ret[one++]=nums[start++];
            ret[one++]=nums[end++];
        }
        return ret;
    }
}