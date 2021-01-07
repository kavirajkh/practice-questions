package coding.leetcode.topics.arrays;


/*
Kaviraj's Interview Pad

Guidelines:
1. You (or I) can google syntax/libraries that
you would like to use for each problem.
2. Try to diagram/use minimal pseudocode before coding.
3. Explain your thought process as much as you can.
4. Feel free to ask clarifying questions about the problem.

complementPair(nums) - Given an array of integers,
return all the positive values that have a matching negative value

Space complexity: No constraints
Time complexity: No constraints

// compliment Array [-1, 4, -2, -3, -4]
// outPut Array [4,+1]
Example: [1, -4, 2, 3, 4, -1, 5] -> [1, 4] or [4, 1]
*/

import java.io.*;
        import java.util.*;

public class ComplimentPair {

    private static List<Integer> output = new ArrayList<Integer>();

    public static void main (String[] args) {

        Integer[] testArr1 = {1, -4, 2, 3, 4, -1, 5};
        Object[] answer1 = complementPair(testArr1);


        for (int i = 0; i < answer1.length; i++) {
            System.out.println(answer1[i]);
        }

    }

    private static Object[] complementPair(Integer[] testArr1) {

        if (testArr1 == null) {
            return output.toArray();
        }

        List<Integer> complimentArray = new ArrayList<Integer>();
        //    int[] testArr1 = {1, -4, 2, 3, 4, -1, 5};

        for (int i=0; i<testArr1.length; i++) {

            if(complimentArray.contains(testArr1[i])) {
                //System.out.println("Inside");

                if (testArr1[i]>0) {
                    output.add(testArr1[i]);
                } else {
                    int value = testArr1[i]*-1;
                    output.add(value);
                }

            }
            int value = testArr1[i]*-1;
            //System.out.println("compliment"+ value);
            complimentArray.add(value);
            //System.out.println(complimentArray);
        }
        return output.toArray();
    }
}
