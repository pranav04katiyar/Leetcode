class Solution {
    public int removeDuplicates(int[] nums) {
        int currIndex = 0;
        int currentVal = nums[0];
        int count  = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=currentVal){
                currIndex++;
                count++;
                nums[currIndex]=nums[i];
            }
            currentVal = nums[i];
        }
        return count;
    }
}