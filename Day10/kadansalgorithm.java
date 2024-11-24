class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
            maxsum=Math.max(maxsum,currsum);
            if(currsum<0) currsum=0;
            }
        return maxsum;
    }
}
