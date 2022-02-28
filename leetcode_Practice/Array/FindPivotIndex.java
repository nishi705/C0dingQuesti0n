package Array;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int suml = 0;
        int sumr = sum;

        for (int i = 0; i < nums.length; i++) {
            sumr = suml - nums[i];
            if (suml == sumr) {
                return i;
            }
            suml = suml + nums[i];

        }
       return -1;
    }
}
