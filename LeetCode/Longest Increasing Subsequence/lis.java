class Solution {
    public static int lower_bound(int[] arr, int length, int value){
        int low = 0, high = length ;
        while(low < high){
            int mid = (low + high) / 2;
            if(value > arr[mid]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return low;
    }
// great !
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int length = 0;
        for(int num : nums){
            int i = lower_bound(dp, length, num);
            dp[i] = num;
            if(i == length){
                length++;
            }
        }
        return length;
    }
}