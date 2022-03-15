package FinalPart;
// the function findpivot with duplicate elements will be useful in case of searching of an element
// or target in a sorted rotated array
public class RBS_Duplicate_Elements {
    public static void main(String[] args) {
        // in case of the presence of the duplicate elements in the array
        // the conditions for finding the pivot element will fail as the two conditions
        // if
        // arr[mid] <= arr[start]
        // then end =  mid -1
        //  else
        // start = mid + 1
        // these two conditions will fail due to the presence of the same element at start , mid and end positions
        // CONCEPT --
        // arr = {2,2,2,2,9};
        // rotated twice
         // new arr - { 2,9,2,2,2,}
        // step 1 --
        // from both the ends we can skip a num
        // start = start + 1 and end = end -1
        //  as both these two elements are same
        // we are ignoring the duplicate elements as it is a an rotated array
        // pivot - is THE LARGEST ELEMENT IN THE ARRAY
        // int[] arr = {4,5,6,7,0,1,2};

    }
    static  int Find_Pivot_DuplicateElements(int[] arr )
    {
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end - start)/2;
            // 1st case
            //int[] arr = {4,5,6,7,0,1,2};
            if(arr[mid] > arr[mid+1])
            {
                return mid ;
            }
            // 2nd case
            if(arr[mid]<arr[mid-1])
            {
                return mid -1 ;
            }
            // if elements at the middle , start , end are same then just skip the duplicates
            // int[] arr = {4,5,6,7,0,1,2};
            if(arr[mid] == arr[start] && arr[mid] == arr[end] )
            {
                // just skip the duplicates

                // NOTE: what if these elements at start , end and mid were the pivot any one of them
                //  check if start is pivot
                // start will be pivot if the next element will be smaller than the start
                //
                if(arr[start] > arr[start+1])// condition for checking if start is the pivot
                {
                    return  start;
                }
                // int[] arr = {4,5,6,7,0,1,2};
                start ++; // cause we need to update the start pointer // we are doing this cause this are duplicates and we are just skipping it
                // now lets check if the end pointer is the pivot or not
                if(arr[end]<arr[end-1]) // condition for checking if the end is the pivot
                {
                    return end -1 ;

                }
                end -- ;

            }
            // left side is sorted , so pivot should be in the right side
            // the 3 positions will be entertained start , mid , end



            //
            else if(arr[start]<arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])
            { // just think of mid as the target element
                // and what we do in case of a normal binary search we are doing just that

                start = mid + 1 ; // for shifting or skipping to the right side
                // as duplicates elements are present or we can say that  by analagy we are using  the binary search
            }
            else
            {
                end = mid -1 ; // for shifting to the left side
                // end = mid -1
            }

        }
        return  -1 ;
    }
}
