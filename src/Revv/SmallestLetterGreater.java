package Revv;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLetterGreater {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        char[] arr = new char[n];
        System.out.println("please enter the elements in the array :");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.next().charAt(0);
        }
        // scanning done
        System.out.println("please enter the target element :");
        char target = in.next().charAt(0);
        System.out.println("OG " + Arrays.toString(arr));
        System.out.printf("the ceiling character of the target character %c is %c",target,nextGreatestLetter(arr,target));







    }
    static char nextGreatestLetter(char[] arr, char target)
    {
        // simple binary search ceiling problem statement with a few modifications
        int start = 0 ;
        int end  = arr.length-1 ;// cause we are taking in the index value
        while (start<=end)
        {
            int middle = start + (end-start)/2;
            // cause range may exceed problem
            if(target<arr[middle])
            {
                end = middle -1 ;
            }
            else
            {
                start = middle + 1 ;
            }


            // until and unless the start > end the while loop wil run
            // the while loop will end when the start pointer becomes > end
            // ie start becomes end + 1 ; then the loop stops or breaks
        }
       // return arr[start % arr.length]; // cause this is for the wrap around case
        // ex - {a,d,g,h} ;
        // if the target element is h then the ans would be a -- wrap around so
        // start % arr.length
        if(start==arr.length)
        {
            return arr[0];
        }
        else
            return arr[start];


    }

}
