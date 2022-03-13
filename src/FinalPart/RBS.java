package FinalPart;
//Question link : https://leetcode.com/problems/search-in-rotated-sorted-array/

// Search in a rotated sorted array
// 2 parts divide -- > 1] finding pivot
// 2] finding the target element inside the array using pivot
public class RBS {
    public static void main(String[] args) {

    }




    static int search(int[] nums, int target) {
    int pivot =  Find_Pivot(nums);

    // say we dont have a pivot
        // ie we have -1
        // this means the array is not rotated
        if(pivot ==-1)
        {
            // just do the normal binary search
            // if we found out that there is no pivot
            // it means the array is not rotated
            return  binarysearch(nums,target,0,nums.length-1);
        }


        // now if pivot is found then we now have two ascending order arrays one on the left side of the pivot
        // and the 2nd one is on the right side of the pivot



        if(target >= nums[0]) // the target element > the start element
        {
            return binarysearch(nums,target,0,pivot-1);
        }
        else
        {
            return binarysearch(nums,target,pivot+1,nums.length-1);
        }



    }



    static int Find_Pivot(int[] arr)
    {
        int start = 0 ;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start)/2;// cause of ramge
            // 4 cases now
            // CASE 1
            if(mid < end && arr[mid] > arr[mid+1]) // && operator both true then true if both false then false
            // or else it will not run
            {
                return mid;
            }
            // CASE 2
            if(mid > start && arr[mid]< arr[mid-1])
            {
                return mid - 1 ;
            }
            //CASE 3
            if(arr[mid] <= arr[start])
            {
                end = mid - 1 ;
            }
            //CASE 4 ie arr[mid] >= arr[start]
            else {
                start = mid + 1; // cause the greater elements or larger element will lie on the right side of the middle element
            }
        }
        return -1;
    }
    static  int binarysearch(int[] arr , int target,int start , int end)
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
