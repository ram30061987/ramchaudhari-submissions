class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int width;
        int minHeight;
        int area=0;
        int maxArea=0;
        while(left<right){
            width = right-left;
            minHeight = Math.min(heights[left],heights[right]);
            area = minHeight * width;
            maxArea = Math.max(maxArea, area);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxArea;
        
    }
}
