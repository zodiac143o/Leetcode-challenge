import java.util.Arrays;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        long res=0;
        int n=nums.length;
        long[] s=new long[n];
        for(int i=0;i<n;i++)
        {
            s[i]=nums[i]*nums[i];
        }
        Arrays.sort(s);
        for(int i=0;i<n;i++)
        {
            if(i<n/2)
            {
                res-=s[i];
            }
            else
            {
                res+=s[i];
            }
        }
        return res;
    }
}