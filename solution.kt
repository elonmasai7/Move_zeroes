class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var lastNonZeroFoundAt = 0

        for (current in nums.indices){
            if (nums[current] != 0){
                val temp = nums[lastNonZeroFoundAt]
                nums[lastNonZeroFoundAt] = nums[current]
                nums[current] = temp
                lastNonZeroFoundAt++
            }
        }
        
    }
}  
 
fun main() {
    val solution =Solution()

    val nums1 = intArrayOf(0, 1, 0, 3, 12)
    solution.moveZeroes(nums1)
    println(nums1.joinToString(", "))

    val nums2 = intArrayOf(0)
    solution.moveZeroes(nums2)
    println(nums2.joinToString(", "))
}
