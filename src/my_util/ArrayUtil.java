package my_util;

import java.util.Arrays;

public class ArrayUtil {
    public static int minNumInArray (int [] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    // create a method finds max from int array
    public static int maxNumInArray (int [] nums) {
        Arrays.sort(nums);
        return nums[nums.length-1];
    }
}
