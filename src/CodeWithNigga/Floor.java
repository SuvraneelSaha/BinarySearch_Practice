package CodeWithNigga;

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        //Find the floor of a no.
        // smaller or equal to the target element
        // Floor is -   greatest number which is smaller or equal to the target element
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements of the array :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("please enter the target element to be followed :");
        int target = in.nextInt();
        System.out.printf("the ceiling element close to the target element %d is %d ", target, ceiling(arr, target));

    }

    static int ceiling(int[] arr, int target) {
        // what if the target element is < than the lowest element in the array
//        if(target<arr[0])
//        {
//            return -1;
//        }
        // not needed as the end pointer becomes -1 ; 
        int start = 0;
        int end = arr.length - 1; // cause we are taking in the index position
        while (start <= end) { // ascending order
            int mid = start + (end - start) / 2; // cause we need to find the middle element in each iteration
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return end; // cause the end will be < than start and we need to return the biggest number which is
        // smaller than the target element
        // same thing as before ; we are just returning the end instead of returning -1 if the no. is not found
        //


    }
}
// CONVENTIONAL
// the target should lie between the range of start and end
// ie start target end
// THE ANS IS NOT IN THIS RANGE
// the condition is violated means the target element does not lie between the range of start and the end pointer
// in case of floor it will be like target end start
// as start gets incremented by 1 so start > end
// END TARGET START // WE ARE RETURNING THE END AS IT THE NEXT LYING ELEMENT WHICH IS SMALLER OR EQUAL TO THE TARGET ELEMENT
// AS WE ARE FINDING THE NEXT BIG ELEMENT WHICH IS SMALLER OR EQUAL TO THE TARGET ELEMENT SO
// WE ARE RETURNING THE END
//WHEN THE CONDITION IS VIOLATED START = END + 1 ;
// WE KNOW THE BASIC CONDITION OF BREAKING OF THE WHILE LOOP
// IT IS WHEN START BECOMES > END
