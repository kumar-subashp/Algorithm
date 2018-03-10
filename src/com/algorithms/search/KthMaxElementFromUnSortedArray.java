package com.algorithms.search;


import java.util.Scanner;

/**
 * To find K’th Largest Element in Unsorted Array
 */
public class KthMaxElementFromUnSortedArray {

    public static void main(String[] args) {
        int[] input = {4, 9, 2, 5, 1, 3, 8}; // 1 2 3 4 5 8 9

        System.out.print("Enter the Kth Position : ");
        Scanner scanner = new Scanner(System.in);
        int position = scanner.nextInt();


        findKthMaxElement(input, position);

        System.out.println(String.format("%sth Largest element in unsorted array is : %s", position, input[position - 1]));

    }

    private static void findKthMaxElement(int[] input, int position) {
        boolean isDone = true;

        do {

            isDone = false;
            for (int i = position; i < input.length; i++) {

                if (input[position - 1] < input[i]) {
                    swapElement(input, position, i);
                    isDone = true;
                }

            }

            for (int j = position - 2; j >= 0; j--) {
                if (input[position - 1] > input[j]) {
                    swapElement(input, position, j);
                    isDone = true;
                }
            }

        } while (isDone);
    }

    private static void swapElement(int[] input, int positionFrom, int positionTo) {
        int tmp = input[positionFrom - 1];
        input[positionFrom - 1] = input[positionTo];
        input[positionTo] = tmp;
    }
}
