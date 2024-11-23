class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n=arr.length;
        Arrays.sort(arr);
        int diff=arr[n-1]-arr[0];
        int mindiff=diff;
        for(int i=0;i<n-1;i++){
            int maxheight=Math.max(arr[n-1]-k,arr[i]+k);
            int minheight=Math.min(arr[0]+k,arr[i+1]-k);
            if(minheight>=0){
                mindiff=Math.min(mindiff,maxheight-minheight);
            }
        }
        return mindiff;
    }
}
