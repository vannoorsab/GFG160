class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        StringBuilder str=new StringBuilder();
        int carry=0;
        int i=s1.length()-1;
        int j=s2.length()-1;
        while(i>=0||j>=0||carry>0){
            int sum=carry;
            if(i>=0) {sum+=s1.charAt(i)-'0';
            i--;
            }
            if(j>=0){ sum+=s2.charAt(j)-'0';
            j--;
            }
            str.append(sum%2);
            carry=sum/2;
           
        }
        str.reverse();
        String result =str.toString();
        return result.equals("0")?"0":result.replaceFirst("^0+"," ");
        
    }
}