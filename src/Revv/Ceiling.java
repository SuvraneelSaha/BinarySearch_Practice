package Revv;

import java.util.Arrays;
import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        // In case of a ceiling problem in a sorted array which is in ascending order
        // we need to return the next smallest element which is greater than or equal to the target element
        // ie EX
        // 10 , 12 ,13, 14 ,15 , 18 , 20
        // target element  = 16
        // so which is the smallest number which is greater than or equal to the target element
        // ans - 18
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
        System.out.printf("the ceiling number of %d is index %d",target,ceiling(arr,target));

    }
    static int ceiling(int[] arr , int target)
    {
        // edge test case cause the no. if exceeds the largest no. of the array then what will it return
        // think it wont be able to return anything
        if(target>arr[arr.length-1])
        {
            return -1;
        }
        int start = 0 ;
        int end  = arr.length-1 ;
        while (start<=end)
        {
            int mid = start + (end - start)/2; // cause of the exceed range problem
            if(target>arr[mid])
            {
                start = mid + 1 ;
            }
            // greater than or equal to boleche so
            else if (target<arr[mid])
            {
                end = mid -1 ;
            }
            else
            {
                return mid;
            }

        }
        //return arr[start]; // we may also return the element instead of the index of the start pointer
        // when the while loop breaks
        return start;
    }
}
