package CodeWithUvro;

public class FirstAndLastPosition_New {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] arr, int target)
    {
        int[] ans = {-1,-1};// default condition
        // checking for the 1st occurence of the target element which lies in the left hand side
        int first = search(arr,target,true); // we are actually trying to find the 1st occurence which is in the left hand side
        int second = search(arr,target,false);// we are not finding the 1st occurence here so false ;
        // as a result it will find the last occurrence which is on the right hand side as
        // start = mid + 1 gets executed
        ans[0] = first;
        ans[1] = second;
        return ans;




    }
    // this below function returns the index value of the target element
    // ie for the 1st occurrence and for the last occurrence

    public int search(int[] arr, int target , boolean findstartindex) // wheteher we are trying to find the start index
    {
        int ans = -1;

        int start = 0;
        int end = arr.length - 1; // cause we are taking in the index position
        while (start <= end)
        { // ascending order
            int mid = start + (end - start) / 2; // cause we need to find the middle element in each iteration
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                // here we are not going to return mid
                // we are actually taking the potential ans
                // cause 1st occurence will be on the left side of the target element
                // and the last occurence will be on the right side of the target element

                ans = mid; // THE POTENTIAL ANS IS FOUND

                // here we are trying to find the first occurrence or the 1st starting index of the target element
                // we have found the middle ans ie the target element
                // their might be possibility that the other same target elements are present on the left hand side
                // then the element at the farthest left hand side will be the 1st occurrence of the target element
                //
                if (findstartindex)//(findstartindex == true) cause findstartindex  itself is a boolean expression
                {
                    end = mid - 1; // cause left hand side smaller or similar // binary search
                }
                else
                {
                    start = mid + 1;
                }
            }
        }
        return ans;

        }
    }
