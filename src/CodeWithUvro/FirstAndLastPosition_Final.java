package CodeWithUvro;

public class FirstAndLastPosition_Final {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] arr, int target)
    {
        int[] ans= {-1,-1};

        ans[0] = search(arr,target,false);
        if(ans[0] != -1)
        {
            ans[1] = search(arr, target, true);
        }// edge case problem so
        // -1

        return ans ;
    }
    static int search(int[] arr, int target,boolean findlastindex)
    {
        int ans = -1 ;
        int start  = 0 ;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end - start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }
            else if(target<arr[mid])
            {
                end = mid -1 ;
            }
            else
            {
                    ans = mid ;
//                    if(findstartindex ==true) // we are actually finding the last occurence
//                        // and based on that we will find the the 1st occurence
//                    {
//                        end = mid -1 ;
//                    }
//                    else
//                    {
//                        start=mid+1;
//                    }
                    // or this
                    if(findlastindex == true)
                    {
                        start = mid + 1 ;
                    }
                    else
                    {
                        end = mid -1 ;
                    }
            }
        }
        return ans;
    }
}
