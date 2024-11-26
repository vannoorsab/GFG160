class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int n=arr.length;
        int maxsum=kadans(arr);
        int totalsum=0;
        for(int num:arr)
        {
            totalsum+=num;
        }
        int []arry=new int[n];
        for(int i=0;i<arr.length;i++){
            arry[i]=-arr[i];
        }
        int minsum=kadans(arry);
        minsum=-minsum;
        if(totalsum==minsum){
            return maxsum;
        }
        int circularsum=totalsum-minsum;
        return Math.max(maxsum,circularsum);
    }
    private int kadans(int [] arr){
        int maxending=arr[0];
        int maxfar=arr[0];
        for(int i=1;i<arr.length;i++){
            maxending=Math.max(arr[i],maxending+arr[i]);
            maxfar=Math.max(maxfar,maxending);
        }
        return maxfar;
    }
}
