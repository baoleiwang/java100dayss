package QuickTest.Array.testCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author yxh
 * @description 说明：在此类中做测试题，使用构造函数实施main方法作为调试入口
 * @description 做题前可以先看一下srcCode中的源代码，了解使用的方法和属性。
 * @description 使用function作为问题的解答，使用test作为答案的测试
 * @description 本类主要作为array的使用学习，截取了几个简单的array类型的leetcode问题来帮助入门
 * @date 2022-01-04 14:05:41
 */

public class ArraySolution {

    //类构造函数，使用此类生成对象，便执行构造方法。
    //构造方法（函数）与类名相同，但无返回值，使用this调用类中的方法。
    public ArraySolution() {
        this.test1();
    }

    public static void test1() {
        System.out.println("");
    }

    public static void function1() {

    }

    /*
     * 001
     * Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and
     * ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
     *
     * Specifically, ans is the concatenation of two nums arrays.
     *
     * Return the array ans.
     *
     * Example 1:
     *
     * Input: nums = [1,2,1]
     * Output: [1,2,1,1,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
     * - ans = [1,2,1,1,2,1]
     *
     * Example 2:
     *
     * Input: nums = [1,3,2,1]
     * Output: [1,3,2,1,1,3,2,1]
     * Explanation: The array ans is formed as follows:
     * - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
     * - ans = [1,3,2,1,1,3,2,1]
     *
     */
    public int[] getConcatenation(int[] nums) {
        return null;//init
    }


    /*
     * 002
     * Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]]
     * for each 0 <= i < nums.length and return it.
     *
     * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
     *
     * Example 1:
     *
     *
     * Input: nums = [0,2,1,5,3,4]
     * Output: [0,1,2,4,5,3]
     * Explanation: The array ans is built as follows:
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     *
     * Example 2:
     *
     *
     * Input: nums = [5,0,1,2,3,4]
     * Output: [4,5,0,1,2,3]
     * Explanation: The array ans is built as follows:
     * ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
     *
     */
    public int[] buildArray(int[] nums) {
        return null;//init
    }


    /*
     * 003
     * There is a programming language with only four operations and one variable X:
     *
     * ++X and X++ increments the value of the variable X by 1.
     * --X and X-- decrements the value of the variable X by 1.
     * Initially, the value of X is 0.
     *
     * Example 1:
     *
     * Input: operations = ["--X","X++","X++"]
     * Output: 1
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * --X: X is decremented by 1, X =  0 - 1 = -1.
     * X++: X is incremented by 1, X = -1 + 1 =  0.
     * X++: X is incremented by 1, X =  0 + 1 =  1.
     *
     * Example 2:
     *
     * Input: operations = ["++X","++X","X++"]
     * Output: 3
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * ++X: X is incremented by 1, X = 0 + 1 = 1.
     * ++X: X is incremented by 1, X = 1 + 1 = 2.
     * X++: X is incremented by 1, X = 2 + 1 = 3.
     *
     * Example 3:
     *
     * Input: operations = ["X++","++X","--X","X--"]
     * Output: 0
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * X++: X is incremented by 1, X = 0 + 1 = 1.
     * ++X: X is incremented by 1, X = 1 + 1 = 2.
     * --X: X is decremented by 1, X = 2 - 1 = 1.
     * X--: X is decremented by 1, X = 1 - 1 = 0.
     */

    public int finalValueAfterOperations(String[] operations) {
        return -1;
    }


    public static void main(String[] args) {
        new ArraySolution();
    }

}