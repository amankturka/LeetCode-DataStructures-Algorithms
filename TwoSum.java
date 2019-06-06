class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Algo:
        //Store all the elements in hash map
        //Find all possible two nums in map whose sum equals target
        //add these numbers to array
       
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            int num2 = target - nums[i];
            if(map.containsKey(num2) && map.get(num2) != i){
                return new int[] { i, map.get(num2) };
            }
        }
        return null;
    }
}