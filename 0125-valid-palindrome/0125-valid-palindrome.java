class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        //겹치는 부분에 도달하면 종료
        while (start < end) {
            //!Character.isLetterOrDigit() -> 문자가 아닌 것들은 제거
            if (!Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }else if (!Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }else{
                //toLowerCase() -> 소문자로 변환해 양쪽 문자가 다르면 펠린드롬 X
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                    return false;
                }
                 start++;
                 end--;
            }
        }
        return true;
    }
}