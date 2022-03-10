package CodeWithNigga;
// Actually
// Ascending order Binary Search

import java.util.Scanner;

public class Ceiling_Rough {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements of the array :");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("please enter the target element to be followed :");
        int target = in.nextInt();
        System.out.printf("the ceiling element close to the target element %d is %d ",target,ceiling(arr,target));

    }
    static int ceiling(int[] arr,int target)
    {
        int start = 0 ;
        int end = arr.length-1; // cause we are taking in the index position
        while (start<=end)
        { // ascending order
            int mid = start + (end - start)/2; // cause we need to find the middle element in each iteration
            if(target>arr[mid])

            {
                start = mid + 1 ;
            }
            else if(target<arr[mid])
            {
                end = mid -1;
            }
            else {
                return mid;
            }

        }
        return -1; // this returns -1 when the element does not belong in the array ; user given array
    }
}
