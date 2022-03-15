package FinalPart;

public class SplitArray_LargestSum_Final {
    public static void main(String[] args) {
        int[] arr = {7,2,5,10,8};
    }
    static int splitArray(int[] nums, int m) {
        int start = 0 ;
        int end = 0 ;
        for (int i = 0; i <nums.length ; i++) // in the end of this loop this will contain the max item from the array
            // simple linear search
        {
            start = Math.max(start,nums[i]);

            end = end + nums[i]; // in the end we will get the sum of the elements in the array

        }
        // START and END found
        // now we use the binary search

        while (start<end)
        {
            // try for the middle as the potential ans
            // ie we  will treat the middle as the largest sum which is the reference point for making subarrays
            int mid = start + (end - start)/2;

            // calculate how many pieces we can divide this in with the max sum
            int sum = 0;
            int pieces = 1 ; // cause least pieces
            for(int num : nums )
            {
                if(sum + num > mid)
                {
                     // you cannot add this in this sub array , make new one
                    //  say you add this num in new sub array , then sum  = num ;
                    sum = num ; // new element added in another sub array
                    pieces ++ ; // cause 1 sub array has been added
                }
                else
                {
                    sum = sum + num ; // mistake acknowledged
                }
            }

            if(pieces>m)
            {
                start = mid + 1 ;
            }
            else
            {
                end = mid ;
            }
        }


        return end ; // or start as both will be the same at the end as middle , start , end will all be same
        // start == end
    }
}

// IMP - IF YOU DONT PRACTICE YOU WONT BE ABLE TO CLEAR THE INTERVIEWS
// PRACTICE IS THE KEY
//  
