class Solution {
    public int lengthOfLastWord(String s) {
        
        int n = s.length()-1; 

        while( n >= 0 && s.charAt(n) == ' '){
            n--;
        }

        int result =0;
        while( n>=0 && s.charAt(n) != ' '){
            result++;
            n--;
        }

        return result;
    }
}