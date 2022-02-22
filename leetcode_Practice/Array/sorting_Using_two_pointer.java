package Array;

import java.util.Arrays;

class sorting_Using_two_pointer {
    public void sortColors(int[] nums) {
        int low=0, high=nums.length-1, cur=0;
        while(cur<=high)
        {
            if(nums[cur]==2)
            {
                swap(nums,cur,high);
                high--;
            }
            else if(nums[cur]==0)
            {
                swap(nums,cur,low);
                cur++;
                low++;
            }
            else if(nums[cur]==1)
                cur++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}