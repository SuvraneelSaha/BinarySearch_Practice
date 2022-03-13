package FinalPart;

public class Search_RotatedArray {
    public static void main(String[] args) {
        // it should click in your mind when you see a sorted array that the binary search will be used
        // normal ARRAY
        // [2,4,5,7,8,9,10,12]
        // after 1 rotation in the clockwise direction
        // the new array will be [ 12 , 2,4,5,7,8,9,10]
        // after 2nd rotation the array will be
        // [10,12,2,4,5,7,8,9]
        // there would be two approaches to solve the problem
        // 1 ] to find the pivot in the array
        // here the pivot is 12

        //  pivot - or we can say that the largest no. in the array is the pivot


        // pivot --> from where the next nos are in ascending order
        // ex - [3,4,5,6,7,0,1,2]
        // 7 is the pivot
        // left hand side is also ascending
        // right hand side is also ascending

        // every single rotated array will follow this format
        // ie on the left hand side of the pivot it will be ascending order
        // and also on the right hand side of the pivot it will be ascending order
        // so we need to just apply binary search on both the sides


        //CRUCIAL STEPS TO FOLLOW IN SEARCH IN ROTATED ARRAY
        // 1] FIND PIVOT
        // 2]   SEARCH IN THE FIRST HALF - CAUSE IT IS A SORTED ARRAY SO BINARY SEARCH FROM THE START INDEX 0 TILL THE PIVOT
        //(0,PIVOT)
        // 3] OTHERWISE IF NOT FOUND THEN SEARCH IN THE 2ND HALF
        // WHICH IS (PIVOT+1 , END ) TILL THE END

        // KUNAL IS TEACHING HOW TO THINK NOT WHAT TO THINK
        // UNDERSTAND THE DIFFERENCE AND APPLY



    }
}
