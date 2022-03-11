package Revv;
 // Full problematic setup

import java.util.Arrays;
import java.util.Scanner;

public class First_Last_New {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements of the array :");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();

        }
        System.out.println("please enter the target element :");
        int target = in.nextInt();
        System.out.println(Arrays.toString(searchRange(arr, target)));

    }
    static int[] searchRange(int[] nums, int target)
    {
        int[] ans = {-1,-1};
        ans[0] = normalbinarysearch(ans,target,true);
        ans[1] = normalbinarysearch(ans,target,false);



        return ans;
    }
    static int normalbinarysearch(int[] arr,int target,boolean first)
    {
        int ans = -1 ;// by default if the ans is not found
        int start = 0 ;
        int end = arr.length-1;
        while(start<=end)
        {
            int middle = start + (end - start)/2;
            if(target>arr[middle])
            {
                start = middle + 1 ;
            }
            else if(target<arr[middle])
            {
                end = middle -1 ;
            }
            else
            {
                // potential ans found ie the index position
                ans = middle ;
                    if(first) {
                        end = middle - 1;
                        // for finding the index of the 1st occurence
                        // which will lie on the left hand side
                    }
                    else {
                        start = middle + 1 ;
                    }

            }

        }
        return ans;
    }

}
