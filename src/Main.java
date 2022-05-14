
public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{1,8,6,2,5,4,8,3,7};
        int[] nums2 = new int[]{3,9,3,4,7,2,12,6};
        int k = maxArea(nums2);
        System.out.println(">>>>>>>>>?? "+ k);
    }
    public static int maxArea(int[] height) {
        int first=  0, last = height.length-1;
        int area = 0;
        while (first < last){
            area = Math.max(Math.min(height[first], height[last]) * (last - first), area);
            if(height[first] < height[last]){
                first++;
            }else {
//                area = Math.max(height[last] * (last - first), area);
                last--;
            }


        }
        return area;
    }
}

