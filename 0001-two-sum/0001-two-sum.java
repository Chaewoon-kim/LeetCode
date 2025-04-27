class Solution {
    public int[] twoSum(int[] nums, int target) {
      //HashMap으로 시간복잡도 개선
      Map<Integer , Integer> numsMap = new HashMap<>();

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