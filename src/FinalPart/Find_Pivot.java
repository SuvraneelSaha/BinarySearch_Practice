package FinalPart;

public class Find_Pivot {
    public static void main(String[] args) {
        // [3,4,5,6,7,0,1,2]
        // 3 , 4 5 ,6 , 7 is in ascending order
        // 0 , 1 , 2 is also in ascending order
        // so the omly condition in 7 , 0
        // is in descending  order
        // condition -- mid > mid + 1 --. mid is the pivot  that is the pivot element  now
        // Friends pivot lol
        // (mid) > mid + 1  -- > this is case 1
        //  2nd case ANS  -- > if (mid) < mid - 1 elemement then  the ans will be mid - 1 element or index
        // 3rd CASE
        // start element >= mid element
        // [ 4,5,6,3,2,1,0]
        // if the mid element is lesser than the start element then
        // the elements on the right hand side of the middle element < the start element
        // in the case all the all the elements from mid will be smaller than the start element < start
        //  hence we can ignore all the elements since we are looking for the peak element ie the largest element
        // then the end = mid - 1 ;
        // CASE 4 --> Start element < the mid element
        // ex - {3,4,5,6,2}
        // the start element < the mid element
        // so the greatest element or the peak element will be on the right side of the mid element
        // so start = mid + 1 ;
        // if the middle element was the pivot thenit would have been returned in the case 1 and case 2
        // hence bigger nos lie ahead ;  hence ignore mid and put start = mid + 1 ;


        // PS :
        // This wont work for duplicate arrays



    }
}
