package CodeWithNigga;
// Question Link : https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args) {
        // FOR A PERSON WHO HAS STUDIED KNOW THE PATTERNS AND KNOWS HOW TO SOLVE THE QUESTIONS
        // FOR HIM EVEN THE HARD QUESTIONS ARE EASY
        // AND THE ONE WHO DOESMT KNOWS THE PATTERNS AND HOW TO SOLVE THE QUESTIONS
        // WILL FIND THE EASY QUESTIONS HARD


    }
    public char nextGreatestLetter(char[] arr, char target)
    {
//        if(target>arr[arr.length-1])
//        {
//            return -1;
//        }
        // not needed because of the wrap around
        // edge case

        int start = 0;
        int end = arr.length - 1; // cause we are taking in the index position
        while (start <= end)
        { // ascending order
            int mid = start + (end - start) / 2; // cause we need to find the middle element in each iteration
            if (target > arr[mid])
            {
                start = mid + 1;
            }
            else // we are removing the target < arr[mid] condition as it is not required
            // atp as it has been clearly stated that only the greater than element is required not the equal to element
            {
                end = mid - 1;
            }
            // else part is abandoned as it is not required as we are returning the next greatest character not the exact position of the
            // target character

        }
        return arr[start % arr.length] ;
        // if it is not simplified then we need to use another return start
        // we are doing this because to simplify the wrap around case
        // if(start%n) ----
        //  return arr[0]
        //  the condition has been simplified to start % arr.lenght
        // we need to return the letter not the index
    }
}
// CRUCIAL POINTS :
// 1] Exact same approach and theory for the ceiling of a target element binary search problem
// 2] Ignore the = sign from the target from the character we are finding or the target we are finding
// in the conventional ceiling problem of binary search there were 3 conditions
// i] the target > the arr[mid]
// ii] the target < the arr[mid]
// iii] the target == arr[mid]
// but here the == condition is not needed
// so only 2 conditions
// no thinking required only deleting some lines of code
// 3] the wrap around case
// sometimes its about observing
// in this case we are returning the start%N where N is the size of the array