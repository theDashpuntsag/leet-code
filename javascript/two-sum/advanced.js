/**
 * LeetCode Problem 1: Two Sum (Optimized Hash Map Solution)
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
 * ALGORITHM APPROACH (HASH MAP OPTIMIZATION):
 * 1. Use a hash map (Map object) to store previously seen numbers and their indices
 * 2. For each element, calculate its complement (target - current number)
 * 3. Check if the complement exists in the hash map
 * 4. If yes, return the current index and the stored index of the complement
 * 5. If no, store the current number and its index in the hash map
 * 6. Continue until a pair is found
 * 
 * WHY THIS IS BETTER:
 * - Reduces time complexity from O(n²) to O(n)
 * - Trade-off: Uses O(n) extra space for the hash map
 * - Much more efficient for large arrays
 * 
 * TIME COMPLEXITY: O(n) where n is the length of the array
 * SPACE COMPLEXITY: O(n) for the hash map storage
 */

/**
 * @param {number[]} nums - Array of integers
 * @param {number} target - Target sum value
 * @return {number[]} - Array containing indices of two numbers that sum to target
 */
var twoSum = function(nums, target) {
    // Hash map to store number -> index mapping
    const numMap = new Map();
    
    // Single pass through the array
    for (let i = 0; i < nums.length; i++) {
        // Calculate what number we need to reach the target
        const complement = target - nums[i];
        
        // Check if we've seen this complement before
        if (numMap.has(complement)) {
            // Found the pair! Return indices
            return [numMap.get(complement), i];
        }
        
        // Store current number and its index for future lookups
        numMap.set(nums[i], i);
    }
    
    // Return empty array if no solution found (shouldn't happen per problem constraints)
    return [];
};

/**
 * Alternative solution using object instead of Map for demonstration
 * This approach works identically but uses JavaScript object as hash table
 */
var twoSumWithObject = function(nums, target) {
    const numObj = {};
    
    for (let i = 0; i < nums.length; i++) {
        const complement = target - nums[i];
        
        if (complement in numObj) {
            return [numObj[complement], i];
        }
        
        numObj[nums[i]] = i;
    }
    
    return [];
};

// Example usage and testing
console.log("Testing Two Sum solutions:");
const testNums1 = [2, 7, 11, 15];
const testTarget1 = 9;
console.log(`Input: [${testNums1}], Target: ${testTarget1}`);
console.log(`Output: [${twoSum(testNums1, testTarget1)}]`);

const testNums2 = [3, 2, 4];
const testTarget2 = 6;
console.log(`Input: [${testNums2}], Target: ${testTarget2}`);
console.log(`Output: [${twoSum(testNums2, testTarget2)}]`);
