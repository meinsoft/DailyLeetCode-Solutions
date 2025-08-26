class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            ans=Math.max(nums[l]+nums[r],ans);
            l++;
            r--;
        }
        return ans;
    }
}

