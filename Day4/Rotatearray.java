class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        //int []temp=new int[arr.length];
        int n=arr.length;
        d=d%n;
        int []temp=new int[n];
        for(int i=0;i<n-d;i++){
            temp[i]=arr[i+d];
        }
        for(int i=0;i<d;i++){
            temp[n-d+i]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        
    }
}