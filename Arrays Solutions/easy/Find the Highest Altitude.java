https://leetcode.com/problems/find-the-highest-altitude/description/

class Solution {
    public int largestAltitude(int[] gain) {
        int[] a=new int[gain.length+1];
        int max=0;
        a[0]=0;
        
        int sum=a[0];
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            a[i+1]=sum;
            
        }
        for(int maa:a){
            if(maa>max){
                max=maa;
            }
        }
        return max;
    }
}