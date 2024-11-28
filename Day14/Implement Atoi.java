
class Solution {
    public int myAtoi(String s) {
        // Your code here
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        s=s.trim();
      /*  if(s.isEmpty()){
            return 0;
        }
       // TreeSet<Character>validDigits=new TreeSet<>();
        for(char c='0';c<='9';validDigits.add(c)){
            c++;
        }*/
        int i=0,sign=1;
        if(s.charAt(i)=='-'){
            sign=-1;
            i++;
        }else if(s.charAt(i)=='+'){
            i++;
        }
        long result=0;
        while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            result=result*10+(s.charAt(i)-'0');
            if(result*sign>max){
                return max;
            }
            if(result*sign <min){
                return min;
            }
            i++;
        }
        return (int)result*sign;
        
    }
}