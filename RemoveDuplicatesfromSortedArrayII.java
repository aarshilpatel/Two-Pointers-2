// Time Complexity: O(n)
// Space Complexity: O(1)

/*
 * traverse through the array and only keep the elements occuring
 * twice. then replace the elements with the next unique element
 * twice. return the slow pointer for length.
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int slow = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) count++;
            else{
                count = 1;
            }
            if(count <= 2){
                nums[slow] = nums[i];
                slow++;
            }
        }
        return slow;
    }
}