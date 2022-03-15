package FinalPart;

public class SplitArray_LargestSum {
    public static void main(String[] args) {
        // we can split it into m nos of arrays
        int[] arr = {7,2,5,10,8};
        // Question Concept :
        // sub array of m numbers
        // then find out in which sub array there is the smallest largest sum
         // 7 , 2, 5 ,10 || 8 these two sub arrays
         // 7 , 2, 5  || 10, 8 these two sub arrays
         // 7 , 2  || 5, 10, 8 these two sub arrays
        // 7 || 2,5,10,8 these two arrays

        // WE cannot just make arrays randomly it should be continuous

        // Sum of 7 , 2, 5 , 10 || 8 are ---> 24  & 8 --> larger sum is  24
        // Sum of 7 , 2, 5 , || 10, 8 are ---> 14  & 18 --> larger sum is 18
        // Sum of 7 , 2, || 5, 10, 8 are --->  9   &  23 --> larger sum is 23
        // Sum of 7 ,  || 2,  5, 10, 8 are --->  7   &  25 --> larger sum is 25


        // and among them the smallest sum is 18 -- this is the ans

        // ABOVE IS THE QUESTION CONCEPT

        // SOLUTION -- >
        // CASE 1 :
         // minimum no. of partitions we can make is 1
        // CASE 2 :
        //  max no. of partitions we can make ie atp M is n total number of elements in the array
        // ex - arr[1,2,3,4] --> [1] , [2] , [3] , [4]
        // CASE 1 ELABORATION :
        //  what will be the ans in case 1
        // {7,2,5,10,8}; -- the sum will be 32 ; it will both be the largest and the smallest
        // CASE 2 ELABORATION :
        // {7,2,5,10,8}; --> the no. of sub arrays will be the N ie the no. of elements in the array
        // the individual sub arrays will be the elements in the array
        // ie 7 , 2 , 5 , 10 ,8 will all be individual sub arrays
        // ans ans for this will be --- max element in the array
        // m = 5 ; ths sum of individual sub arrays is the no. itself
        // the max element will be the ans and here {7,2,5,10,8}; the ans is 10

        // CASE DISCUSSION
        // max value of the ans in the question will be -- case 1 ie the sum of all the elements {7,2,5,10,8}; ie -- 32
        // min value of the ans to the Q will be -- case 2 ie the largest of the element -- 10

        // dont think about binary search as sorted array is not given

        // if M = 1 ; then max value ie the sum of all the elements in the array -- {7,2,5,10,8}; -- 32
        // if M = no. of elements -- 5 then -- max value will be 10 cause 10 is the largest element in the array
        // therefor
        // RANGE FOUND -->
        // max value -- Sum of all the elements in the array -- 32
        // min value -- the largest element in the array -- 10
        // whatever the value of M might be
        // RANGE is (10,32) ; // HERE IT CLICKED THAT WE NEED TO USE BINARY SEARCH
        // Start is 10 , end is 32
        // the mid = (10 + 32)/2 = 21

        //  now our objective will be to try to see  IF YOU CAN SPLIT THE ARRAY WITH 21 AS THE MAX SUM
        // ex - [7,2,5] || [8,10] two halves so count or pieces =2
        // CASE 1
        // if(pieces <= m)
        // {END = MID }
        // The largest individual sum we can have is 21
        // but it is not allowing me to make as many pieces they have told me to do so
        // its finishing in less no. of pieces
        // so we reduce 21 ie the mid value
        //  then in the next iteration
        // mid = 15 cause 10 + 21 / 2 = 15.5 so 15
        //  [7,2,5] || [8] || [10] -- 3 pieces
        // in this case start = mid +1 ; simple analogy as the target > arr[mid] so start = mid + 1
        // now start = 16 end = 21
        // new mid = start + end / 2 = 18
        // lets divide this into two arrays where each particular part of the array should contain max sum of 18
        //  [7,2,5] || [8,10] --> 2 pieces only
        // then as pieces <= m
        // start = 16 , end = 18
        //  new mid = 17
        // [7,2,5] || [8] || [10] so pieces - 3 pieces
        // so then
        // CASE 2  :
        // start = mid +1 ie 18
        // so start = 18 , end = 18 and also mid = 18
        // this mid is the ans when start = end

        // the ans exists definately by the above two checks we will reaach the ans





    }
    // IMPORTANT TIP :
    // WHENEVER THERE IS A QUESTION ABOUT FINDING A POTENTIAL ANS IN A RANGE OF NUMBERS IN A SORTED ARRAY THEN  -- BINARY SEARCH


}
