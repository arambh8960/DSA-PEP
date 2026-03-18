class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) { // Corrected comparison operator
                return i;
            } else if (target < nums[i]) {
                return i;
            }
        }
        return nums.length; // If target is greater than all elements, insert at the end
    }
}