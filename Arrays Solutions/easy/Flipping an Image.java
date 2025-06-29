https://leetcode.com/problems/flipping-an-image/description/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        // int[][] flip=new int[image.length][image[i].length()];
        for(int i=0;i<image.length;i++){
           
                int start=0;int stop=image[i].length-1;
                while(start<=stop){
                    int temp=image[i][start]^1;
                    image[i][start]=image[i][stop]^1;
                    image[i][stop]=temp;
                    start++;
                    stop--;
                }
                

        }
        return image;
    }
}