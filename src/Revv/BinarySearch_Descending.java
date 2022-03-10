package Revv;

import java.util.Arrays;
import java.util.Scanner;

// Descending order Binary Search


public class BinarySearch_Descending {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements :");
        for (int i = 0; i <arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        // scanning done
        System.out.println("please enter the target element :");
        int target = in.nextInt();
        System.out.println("OG " + Arrays.toString(arr));
        System.out.printf("the index of the target element %d is %d ",target,binarysearch(arr,target));
    }
    static int binarysearch(int[] arr , int target)
    {
        // 55 , 44 ,33 ,22 ,11
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end)
        {
            int middle = start + (end - start)/2;
            if(target<arr[middle])
            {
                start = middle + 1 ;
            }
            else if(target>arr[middle])
            {
                end = middle -1 ;
            }
            else
            {
                return middle;  // RETURNING THE INDEX POSITION
            }
        }
        // if any of the above conditions doesnt gets executed then the program will return -1
        // as the element is not present in the array
        return -1;
    }
}
