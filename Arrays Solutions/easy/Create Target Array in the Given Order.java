https://leetcode.com/problems/create-target-array-in-the-given-order/


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       List<Integer> target=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
           nums[i]=target.get(i); 
        } 
        return nums;   
    }
}