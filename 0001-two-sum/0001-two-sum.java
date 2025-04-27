class Solution {
    public int[] twoSum(int[] nums, int target) {
      //HashMap으로 시간복잡도 개선
      Map<Integer , Integer> numsMap = new HashMap<>();


      //key와 value를 바꿔 Map으로 저장 -> 출력하고자 하는 값은 배열의 인덱
      for(int i = 0 ; i < nums.length ; i++){
        numsMap.put(nums[i] , i); 
      }

      //target - first value = Second value
      for(int i = 0 ; i < nums.length; i++){
        if(numsMap.containsKey(target - nums[i]) && i != numsMap.get(target - nums[i])){
            return new int [] {i , numsMap.get(target - nums[i])};
        }
      }

      return null;
    }
}