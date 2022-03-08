package CodeWithNigga;

import java.util.Scanner;

public class Ceiling_Final {
    public static void main(String[] args) {
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
        // what if the target element is greater than the greatest element in the array

        if(target>arr[arr.length-1])
        {
            return -1;
        }
        // edge case

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
        return start;
        // cause this is  the condition for the while loop to end
        // this will run when the start pointer will be greater > than the end pointer
        // and ATP we want the element which is the nearest element which  greater or equal to the target
        // so the start pointer will direct to  the required ans
        // as it is pointing the very next element which is situated on the right side of the target element
        // CONCLUSION
        // 1] the condition for the while loop to end --- start>end
        // 2] the start will be greater than the end pointer
        // 3] the start pointer will be pointing to the very next element which is greater than the target element
        // 4] this is the ans - the index of the start pointer

    }
}
// WHEN THE WHILE LOOP BREAKS --- START = END +1 ;
// CAUSE START = MID +1 AS THE START POINTER GETS INCREMENTED
// AND THE START IS > THAN THE END POINTER BY 1 AND IT IS THE REASON WHY THE WHILE LOOP BREAKS
// THEREFORE THE NEXT BIG NO WHEN  NO ANS IS FOUND = THE START ELEMENT

// POINTS --
// AS IT IS A SORTED ARRAY OF ASCENDING ORDER  IMP POINT
// 1 ] AT THE END OF THE WHILE LOOP START = EDN + 1
// 2] THE TARGET ELEMENT DOES NOT LIE BETWEEN THE RANGE OF START TARGET END
// 3] THE TARGET ELEMENT LIES OUTSIDE THE ABOVE RANGE
// 4] THE START POINTER WILL COME AHEAD OF END WHEN THE WHILE LOOP BREAKS
// 5] SO IT MAKES SENSE TO RETURN THE START ELEMENT OR INDEX
// 6] THE ANS OR THE TARGET ELEMENT DOES NOT LIE BETWEEN THE START AND END IE THE ANS THE SOLN
// VISUAL REPRESENTATION --
// END TARGET START // CAUSE THE WHILE LOOP BREAKS
// AND WE ARE FINDING THE NEXT BIG ELEMENT FROM THE TARGET ELEMENT
// AND IF THE TARGET ELEMENT IS FOUND THEN SIMPLE BINARY SEARCH
