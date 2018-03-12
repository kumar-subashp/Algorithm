package com.algotithms.set;

import java.util.Arrays;

public class FindAllSubSetsOfASet {

    public static void main(String[] args) {

        String[] inputSet = {"1", "2", "3"};
        evaluateSubSet(inputSet, new String[inputSet.length], 0);

    }

    /**
     *
     * If n is the nos. of elements in a set then,
     *
     * Total nos. of subset would be : PowerOf(2, n)
     *
     * input = {1, 2}
     *
     *
     *             {}
     *        {}
     *             {2}
     *
     * {} ->
     *
     *             {1}
     *        {1}
     *             {1,2}
     *
     * @param inputSet
     * @param subSet
     * @param startIndex
     */
    private static void evaluateSubSet(String[] inputSet, String[] subSet, int startIndex){

        if (startIndex == inputSet.length){
            System.out.println(Arrays.toString(subSet));
            return;
        }

        subSet[startIndex] = null;
        evaluateSubSet(inputSet, subSet, startIndex+1);


        subSet[startIndex] = inputSet[startIndex];
        evaluateSubSet(inputSet, subSet, startIndex+1);
    }

}
