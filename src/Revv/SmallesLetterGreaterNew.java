package Revv;

public class SmallesLetterGreaterNew {
    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] arr, char target)
    {

        int start = 0 ;
        int end  = arr.length-1 ;
        while (start<=end)
        {
            int mid = start+(end - start)/2;
            if(target<arr[mid]) // always start up with the lowest possible thing or to be more precisely
                // the condition
            {
                end = mid -1 ;

            }
            else
            {
                start = mid +1 ;
            }
        }
//        if(start==arr.length) // when the start pointer's value is equal to that of the size of the array
        // ie after a next iteration the loop will break
        // so then it should return the arr[0] element
        // otherwise return the arr[start] element as usual
//        {
//            return arr[0]
//        }
//        else
//        {
//            return arr[start];
//        }
        return arr[start%arr.length];
    }


}
