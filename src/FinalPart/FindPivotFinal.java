package FinalPart;
// Question link : https://leetcode.com/problems/search-in-rotated-sorted-array/
public class FindPivotFinal {
    public static void main(String[] args) {
        // Crucial steps :
        // 1 ] find the pivot in the array
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(Find_Pivot(arr));


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

}
