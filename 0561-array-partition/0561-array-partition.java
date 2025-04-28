class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        //배열을 정렬하면 인덱스의 짝수 번째에 항상 작은 값이 존재하기 때문에 굳이 리스트를 만들어 min()계산을 하지 않아도 됨
        int sum = 0; 
        for(int i = 0 ; i < nums.length; i++){
            if(i % 2  == 0){
                sum += nums[i];
            }
        }

        return sum;
    }
}
