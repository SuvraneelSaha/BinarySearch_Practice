package FinalPart;
 // Intuition for the rotation count
public class Rotation_Count {
    public static void main(String[] args) {
//        int[] arr = {1,3,5,7,8,1,2,3};
//        int[] arr1={1,2,3,1,3,5,7,8};
        // example of ratation by 3 cound from the end
    }
    // [4,5,6,7,0,1,2]
    // HOW MANY TIMES THE ARRAY IS ROTATED --> PIVOT NO. OF TIMES
    // ie ex -  the original array was -- 0 , 1 , 2 ,4,5,6,7
    // 1 rotation - 7,0,1,2,4,5,6
    // 2 rotation - 6,7,0,1,2,4,5
    // 3 rotation - 5,6,7,0,1,2,4
    // 4 rotation - 4,5,6,7,0,1,2 // the given array
    // so the arr[pivot] = 7 and the no. of times the array has been rotated is
    // the index of the pivot position +1
    // pivot 7 is at index no. 3
    // ie ROTATION COUNT = PIVOT INDEX + 1 -- ans
    // intuition just the whole game is of catching intuitions
    // every time there is rotation the pivot is shifting to the right side with every rotation
    //

}
