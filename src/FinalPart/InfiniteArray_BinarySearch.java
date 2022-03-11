package FinalPart;
// Question Link : https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray_BinarySearch {
    public static void main(String[] args) {
        // While my target element is > end keep doubling


    }
    static int ans(int[] arr,int target)
    {
        // first find the range of the array
        //  first start with a box of size 2
        int start = 0 ;
        int end = 1 ;




        // here the end pointer is considered
        // as if the target element > the end pointer obviously the target element will be greater than the start pointer
        // so no need to compare it with the start pointer
        // condition for the target to lie in the range
        while (target>arr[end])
        {
            int temp = end + 1  ; // this is our new start
            // double the box value after each iteration
            // so
            // the formula for that is
            //  end = previous end + 2 x size of the box
            end = end + (end - start + 1) * 2 ; // we are using start here before updating
            // cause we need to use it to take in the value of the end before updating
            start = temp;

        }
        return search(arr,target,start,end);

    }
    static int search(int[] arr , int target,int start,int end )
    {

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
        return -1;
    }
}
// brute force -- we can use chunks of an array to find the element using binary search
// we will be incrementing from a single element to the whole array to find the section of the array where
// the target element lies in the array
// ie we will be using the reverse of the binary search approach
// where we were using the array and dividing each time by 2 until and unless a single element is received
// and here just the opposite we are multiply it with 2 each time until and unless we find the element lies in the range of the array
// log n -- cause we are multiplying
// from bottoms to the UP
// LEARN THE PATTERN LEARN THE MAIN APPROACH
// SOLVE ALL THE QUESTIONS THROUGH THE PATTERN ONLY
//Spoon feeding teaches nothing but the shape of the spoon