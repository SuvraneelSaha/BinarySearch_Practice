package Revv;
// Question link : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;
import java.util.Scanner;

public class First_Last {
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

        ans[0] = normalbinarysearch(nums,target,true);
        if(ans[0] !=-1){
            ans[1] = normalbinarysearch(nums,target,false);
        }


        return ans;
    }
    static int normalbinarysearch(int[] arr,int target,boolean isfirstindex)
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
                if(isfirstindex)
                {
                    // for finding the index of the 1st occurence
                    // which will lie on the left hand side
                    end = middle -1;
                }
                else
                {
                    start = middle + 1 ;
                }
            }

        }
        return ans;
    }
}
