https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alpha=new int[123];
        for(int i=0;i<sentence.length();i++){
            alpha[sentence.charAt(i)]++;
        }
        for(int i=97;i<=122;i++){
            if(alpha[i]==0){
                return false;
            }
            
        }
        return true;
    }
}