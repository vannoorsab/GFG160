

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        if(arr.length<2) return -1;
        TreeSet<Integer>set=new TreeSet<>();
        for(int num:arr){
            set.add(num);
        }
        if(set.size()<2) return -1;
        set.pollLast();
        return set.last();
        
    }
}