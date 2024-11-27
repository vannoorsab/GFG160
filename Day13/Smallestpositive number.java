class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        HashMap<Integer , Boolean>map=new HashMap<>();
        for(int num:arr){
            if(num>0){
                map.put(num,true);
            }
        }
        int missingnumber=1;
        while(true){
            if(!map.containsKey(missingnumber)){
                return missingnumber;
            }
            missingnumber++;
        }
    }
}
