/**
 * LeetCode Problem 1: Two Sum (Brute Force Solution)
 * 
 * PROBLEM DESCRIPTION:
 * Given an array of integers nums and an integer target, return indices of the two numbers 
 * such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * EXAMPLES:
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * 
 * CONSTRAINTS:
 * - 2 <= nums.length <= 10^4
 * - -10^9 <= nums[i] <= 10^9
 * - -10^9 <= target <= 10^9
 * - Only one valid answer exists.
 * 
 * ALGORITHM APPROACH (BRUTE FORCE):
 * 1. Use nested loops to check all possible pairs of numbers
 * 2. For each element at index i, check all elements after it (index j where j > i)
 * 3. If nums[i] + nums[j] equals target, return [i, j]
 * 4. This ensures we don't use the same element twice and find the first valid pair
 * 
 * TIME COMPLEXITY: O(n²) where n is the length of the array
 * SPACE COMPLEXITY: O(1) - only using constant extra space
 * 
 * FOLLOW-UP: Can you come up with an algorithm that is less than O(n²) time complexity?
 * HINT: Consider using a hash map to store complements
 */

/**
 * @param {number[]} nums - Array of integers
 * @param {number} target - Target sum value
 * @return {number[]} - Array containing indices of two numbers that sum to target
 */
 var twoSum = function(nums, target) {
    // Nested loop approach: check all possible pairs
    for (let i = 0; i < nums.length - 1; i++) {
        for (let j = i + 1; j < nums.length;  j++) {
            // Check if current pair sums to target
            if (nums[i] + nums[j] === target) {
                return [i, j];  // Return indices of the two numbers
            }
        }
    }
    // Return empty array if no solution found (shouldn't happen per problem constraints)
    return [];
};