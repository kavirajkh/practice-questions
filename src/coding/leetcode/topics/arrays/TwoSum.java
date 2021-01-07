package coding.leetcode.topics.arrays;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        Integer[] input = {2,7,11,15};
        int[] output = twoSum(input,9);

        for (int j : output) {
            System.out.println(j);
        }
    }

    public static int[] twoSum(Integer[] nums, int target) {
        int length = nums.length;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i=0; i<length;i++) {
            if (temp.contains(nums[i])) {
                int j = temp.indexOf(nums[i]);
                return new int[] {j,i};
            } else {
                temp.add(target-nums[i]);
            }
        }
        return new int[]{};
    }
}
