https://leetcode.com/problems/add-to-array-form-of-integer/description/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int number=0;
        List<Integer> li=new ArrayList<>();
        int carry=0;
        int sum=0;
        int i=num.length-1;
       while(i>=0 || k>0){
           sum=carry;
           if(i>=0){
                sum+=num[i--];
           }
           if(k>0){
            sum+=k%10;
            k/=10;
           }
           li.add(sum%10);
           carry=sum/10;
       }
       if(carry>0){
        li.add(carry);
       }
        Collections.reverse(li);
        return li;
    }
    
}