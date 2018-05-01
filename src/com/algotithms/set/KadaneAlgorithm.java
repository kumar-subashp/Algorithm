package com.algotithms.set;

/*
  Maximum Subarray Problem
 */
public class KadaneAlgorithm {

    public static void main(String[] args) {
        int[] inputs = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(findMaximumSubArray(inputs));
    }

    private static int findMaximumSubArray(int[] inputs) {
        if (inputs.length == 0) {
            return Integer.MIN_VALUE;
        }

        int maxSubArray = inputs[0];
        int subArraySum = inputs[0];

        for (int i = 1; i < inputs.length; i++) {

            subArraySum += inputs[i];
            if (subArraySum < 0) {
                subArraySum = 0;
            } else if (subArraySum > maxSubArray) {
                maxSubArray = subArraySum;
            }
        }
        return maxSubArray;
    }
}
