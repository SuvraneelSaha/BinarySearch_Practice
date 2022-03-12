package FinalPart;
// Qeustion link : https://leetcode.com/problems/find-peak-element/
public class FindPeakElement {
    public static void main(String[] args) {
// if you stay consistent ; you will be ready
        // do progressive overload
        // have faith in yourself you will see the your own shine
        
    }
    static int PeakElement(int[] arr) {
        int start = 0 ;
        int end = arr.length-1;
        // the == condition is not required cause that is the condition where the max element will be found out

        while (start<end)
        {
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1])
            {
                // here we are in the descending order array or part of the array
                //     this element may be the ans but we will look at the left for the next bigger element which will be a better ans
                // this is the reason why end != mid -1 which is the usual case of binary search
                end = mid ;


            }
            else
            {
                // here we are in the ascending part of the array ie
                // arr[mid] < arr[mid+1]
                start = mid + 1 ;
                // cause arr[mid+1] > arr[mid] so we are ignoring the arr[mid]

            }
            // in the end the start pointer and the end pointer will be the same and will point to the same element
            // which is ans cause of the two check sabove
            //  start and end are alwyas trying to find max element in the above 2 cases
            // hence when they are pointing to just one element , that is the max one
            // casue that is what the checks say
            // more elaboration : at every point of time of start and the end pointer they have
            // the best possible  ans till that time
            // and if we are saying only one item is remaining , hence cause of above line that is the  best possible ans

        }
        return start;// or end cause both are the same at the end
    }
}
