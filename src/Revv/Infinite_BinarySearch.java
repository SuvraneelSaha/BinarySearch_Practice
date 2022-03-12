package Revv;

public class Infinite_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130,
                140, 160, 170};
        int target = 90 ;
        System.out.println(ans(arr,target));


    }
    static int ans (int[] arr , int target)
    {
        int start = 0 ;
        int end = 1 ;
        while (target>arr[end])
        {
            int newstart = end + 1 ;
            end = end + (end - start + 1)*2;
            start = newstart;
        }
        // when the loop will end then the range will be evaluated in which the target element will lie
        return binarysearch(arr,target,start,end);

    }
    static  int binarysearch(int[] arr,int target , int start , int end)
    {
        // not needed cause we will be passing the start and end from the range
//        int start = 0 ;
//        int end = arr.length-1;
        while(start<=end)
        {
            int middle = start + (end - start)/2;
            if(target>arr[middle])
            {
                start = middle + 1 ;
            }
            else if(target<arr[middle])
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
