package Revv;

import java.util.Arrays;
import java.util.Scanner;

// Floor of a number is --- the biggest number which is actually smaller than or equal to the
// target element
// ex arr - {11,22,33,44,55,}
// target element = 25
// then the ans will be 22 or index 1
// as the index of the 22 is 1

public class FloorFinal {
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
        System.out.printf("the floor index value of the target element %d is %d ",target,floor(arr,target));
    }
    static int floor(int[] arr , int target) {
        // edge test case cause the no. if exceeds the largest no. of the array then what will it return
        // think it wont be able to return anything
//        if (target > arr[arr.length - 1]) {
//            return -1;
//        }
        // not needed as by default the end pointer will become -1
        // so its better to not include the test case in it
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // cause of the exceed range problem
            if (target > arr[mid]) {
                start = mid + 1;
            }
            // greater than or equal to boleche so
            else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }

        return end;
    }
}
