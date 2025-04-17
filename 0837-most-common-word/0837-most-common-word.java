import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> ban = new HashSet<>(Arrays.asList(banned));
        //단어별 개수가 저장될 키-값 맵
        Map<String , Integer> counts = new HashMap<>();


        //1. 입력값에 대한 전처리 , 쉼표 -> 공백 and 공백을 기준으로 단어 분리
        String [] words = paragraph.replaceAll("\\W+"," ").toLowerCase().split(" ");/*\\W == 연속적인 단어가 아닌 값*/ 

        //2.금지된 단어가 아닌 경우 단어별로 횟수 증가 
        for(String word : words){
            //만약 금지된 단어가 아니라면 
            if(!ban.contains(word)){
                counts.put(word , counts.getOrDefault(word,0) + 1);
            }
        }

        //3. 가장 많이 등장한 단어 리턴
        return Collections.max(counts.entrySet() , Map.Entry.comparingByValue()).getKey();
        
    }
}