class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0; 
        List<Integer> pairs = new ArrayList<>();

        for(int num : nums){

            pairs.add(num);
            if(pairs.size() == 2){
                sum += Collections.min(pairs);
                pairs.clear();
            }
        }

        return sum;
    }
}