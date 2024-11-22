class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int index=0;
        for(int num:arr){
            if(num!=0){
                arr[index++]=num;
            }
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        //for(int n:arr){
           // System.out.println(n+"");
       // }
    }
}