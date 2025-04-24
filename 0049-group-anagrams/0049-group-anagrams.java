import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String , List<String>> results = new HashMap<>();

        for(String word : strs){
            char [] words = word.toCharArray();
            
            Arrays.sort(words);

            //맵의 키로 사용하기 위해 다시 문자열로 변환
            String key = String.valueOf(words);

            //애너그램을 이루는 단어들을 정렬하면 모두 같은 키를 가진다 -> 키는 하나이지만 여러 개의 값이 생김
            if(!results.containsKey(key)){
                results.put(key , new ArrayList<>());
            }

            //여러 개의 값들을 하나의 키 값에 대응해 대입 
            results.get(key).add(word);

            
        }
        //Output을 보면 키는 필요하지 않기 때문에 Map의 values들만 return
            return new ArrayList<>(results.values());
    }
}