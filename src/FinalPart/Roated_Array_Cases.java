package FinalPart;

public class Roated_Array_Cases {
    public static void main(String[] args) {
        // Cases in the rotated sorted array
        // cases are actually brainstroming
        // what are the situations that can happen
        // case 1 :
        // pivot == taget element -- then the pivot element is the ans
        // CASE 2 : target element > start element
        // then the search space is reduced to start till pivot -1
        // ie (start , pivot -1 )
        // reason -- the elements after the pivot element are smaller than start
        // Case 3 : the target <  start element
        // we know by intuition that
        // ie we know that all elements from  start  till pivot will be bigger than the target element
        // so the search space is (pivot + 1 , end )

    }
}
