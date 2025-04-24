class Solution {
    int left , maxLen;

    public String longestPalindrome(String s) {

        int length = s.length();

        //문자열의 길이가 1인 경우
        if(length < 2){
            return s;
        }
        for(int i = 0 ; i < s.length() - 1; i++){
            extendPalindrome(s , i , i + 1);
            extendPalindrome(s , i , i + 2);
        }
        return s.substring(left , left + maxLen);
        
    }

    public void extendPalindrome(String s , int i , int j){

        while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }

        if(maxLen < j - i - 1){
                left = i + 1;
                maxLen = j - i - 1;
        }
        
    }

}