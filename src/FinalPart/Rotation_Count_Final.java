package FinalPart;

public class Rotation_Count_Final {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int[] arr1 = {1,2,3,4,5,6,7};
        System.out.println("the no. of rotations is "+CountRotations(arr));
        System.out.println();
        System.out.println("with duplicates is " + CountRotationsDuplicates(arr));


    }

     static int CountRotations(int[] arr) {
        int pivot = findpivot(arr);
        //        if(pivot == -1 )
        //        {
        //            return  0 ;
        //        }

         // the above part is not required as if the pivot becomes -1
         // then -1 + 1 = 0 no. of rotations will be the ans


            return pivot + 1 ; // ans cause we are taking the index position
    }
    static int CountRotationsDuplicates(int[] arr)
    {
        int pivot = findpivot_Duplicates(arr);
        return pivot + 1 ;
    }
    // use this for non - duplicates
    static int findpivot(int[] arr)
    {
        int start = 0 ;
        int end = arr.length-1 ;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid ;  // this is the pivot
            }
            if(mid > start && arr[mid] < arr[mid-1])
            {
                return  mid -1 ; // this is the pivot
            }
            if(arr[mid]<=arr[start])
            {
                end = mid -1 ;
            }
            else
            {
                start = mid +1 ;
            }
        }
        return -1 ;
    }
    // use this for the duplicates
    static  int findpivot_Duplicates(int[] arr)
    {
        int start = 0 ;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            // 1st case
            if(arr[mid] > arr[mid+1])
            {
                return mid;
            }
            // 2md case
            if(arr[mid] < arr[mid-1])
            {
                return mid-1;
            }
            // now if all the 3 are the same then what
            // ie start , mid , end are all same
            if(arr[mid] == arr[start] && arr[mid] == arr[end])
            {
                // now we need to check if the start pointer is the pivot or not cause we cannot just skip without checking
                if(arr[start] > arr[start])
                {
                    return  start;
                }
                start ++ ;

                // now we need to check if the end pointer is the pivot or not
                if(arr[end] < arr[end-1])
                {
                    return  end -1 ;
                }
                end -- ; // cause we are shifting the search space
            }
            // if the above if statement doesnt take place that means that  the pivot is on the right side
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end])
            {
                start = mid + 1 ;
            }
            // simple intuition using binary search
            else
            {
                end = mid -1 ;
            }




        }
        return  -1 ;
    }

}
