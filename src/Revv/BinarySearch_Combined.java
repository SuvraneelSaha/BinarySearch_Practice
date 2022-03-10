package Revv;
// Order Agnostic Binary Search
// Agnostic - meaning doubt or confusion
// both the ascending and the descending order is combined here

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Combined {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // scanning done
        System.out.println("please enter the target element :");
        int target = in.nextInt();
        System.out.println("OG " + Arrays.toString(arr));
        if (arr[0] < arr[arr.length - 1]) {
            System.out.printf("the index of the target element %d is %d ", target, binarysearchascending(arr, target));
        } else {
            System.out.printf("the index of the target element %d is %d ", target, binarysearchDescending(arr, target));
        }

    }


    static int binarysearchascending(int[] arr, int target)
    {
        // 55 , 44 ,33 ,22 ,11
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int middle = start + (end - start) / 2;
            if (target > arr[middle])
            {
                start = middle + 1;
            } else if (target < arr[middle])
            {
                end = middle - 1;
            } else
            {
                return middle;  // RETURNING THE INDEX POSITION
            }
        }
        return -1;
    }
    static int binarysearchDescending(int[] arr, int target)
    {
        // 55 , 44 ,33 ,22 ,11
        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int middle = start + (end - start) / 2;
            if (target < arr[middle])
            {
                start = middle + 1;
            } else if (target > arr[middle])
            {
                end = middle - 1;
            } else
            {
                return middle;  // RETURNING THE INDEX POSITION
            }
        }
        return -1;
    }
}
