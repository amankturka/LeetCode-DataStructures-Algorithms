//Problem 11 : Container with most water
class Solution {
    public int maxArea(int[] height) {
        // Using two pointers i and j

        // i = 0 and j = array length -1
        // traverse through array
        // find the area for i and j value
        // area = min(i,j)* distcance between two points i,j
        // if height of j is greater than increment i and fix j
        // else decrement j and fix i

        int i = 0;
        int j = height.length - 1;
        int area = 0;
        while (i < j) {
            area = Math.max(area, (Math.min(height[i], height[j])) * (j - i));
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return area;
    }
}