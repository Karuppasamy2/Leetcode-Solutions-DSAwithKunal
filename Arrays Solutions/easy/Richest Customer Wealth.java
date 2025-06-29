https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        
        for(int a[]:accounts){
            int sum=0;            
            for(int b:a){
                sum+=b;
            }
            if(sum>wealth){
                wealth=sum;
            }
        }
        return wealth;
    }
}