package Revv;

import java.util.Scanner;

public class Occurences {
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


    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstPos(nums, target);
        ans[1] = lastPos(nums, target);
        return ans;
    }

    public int firstPos(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                res = mid;
                end = mid - 1;
            }
        }
        return res;
    }

    public int lastPos(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                res = mid;
                start = mid + 1;
            }
        }
        return res;
    }
}
