class Solution {
    public static int minChar(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + reversed;
        
        int n = combined.length();
        int[] arr1 = new int[n];
        int len = 0; 
        
        for (int i = 1; i < n; i++) {
            while (len > 0 && combined.charAt(i) != combined.charAt(len)) {
                len = arr1[len - 1];
            }
            if (combined.charAt(i) == combined.charAt(len)) {
                len++;
            }
            arr1[i] = len;
        }
    
        return s.length() - arr1[n - 1];

        
        
    }
}