package FinalPart;
// Question link : https://leetcode.com/problems/find-in-mountain-array/
public class MountainArray {
    public static void main(String[] args) {
// SEARCH IN MOUNTAIN ARRAY :

    }
    static  int peakElement(int[] arr) // to find the peak element in a bitonic or mountain array
    {
        int start = 0 ;
        //int end = 1; // this is for finding an element inside of an infinite array approach
        // dont mess up
        // spaced repitation op
            int end = arr.length-1;

        while (start<end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1])
            {
                // we are in the descending part of the array
                end = mid;
            }
            else
            {
                // arr[mid] > arr[mid+1]
                // we are in the ascending part of the array
                start = mid + 1 ;
            }
        }
        // we will find the peak element index of the array
        return start; // or return the end ;
        // cause both will be the same
        // as the final element will have the same index position of start and end

    }
    static  int binarysearch(int[] arr , int target)
    {
        int start = 0 ;
        int end = arr.length-1 ;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(target>arr[mid])
            {
                start = mid + 1 ;
            }
            else if(target<arr[mid])
            {
                end = mid - 1 ;
            }
            else
            {
                return  mid ;
            }
        }
        return -1;
    }


}
