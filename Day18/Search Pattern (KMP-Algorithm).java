class Solution {

    ArrayList<Integer> search(String pat, String txt) {
        // your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = txt.length();
        int m = pat.length();
        
        if (n == 0 || m == 0 || m > n) {
            return ans; 
        }
        
        for (int i = 0; i <= n - m; i++) {
            if (txt.charAt(i) == pat.charAt(0)) {  
                if (txt.substring(i, i + m).equals(pat)) {  
                    ans.add(i);  
                }
            }
        }
        return ans;

    }
}