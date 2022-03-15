package FinalPart;

public class SplitArray_LargestSum {
    public static void main(String[] args) {
        // we can split it into m nos of arrays
        int[] arr = {7,2,5,10,8};
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





    }
}
