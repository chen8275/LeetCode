package com.example.leetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 题意：给定两个数组，编写一个函数来计算它们的交集。
 *
 * 349. 两个数组的交集
 *
 * 说明： 输出结果中的每个元素一定是唯一的。 我们可以不考虑输出结果的顺序。
 *
 * nums1 = [1,4,9] nums=[1,9,5]
 * 输出 [1,9]
 */
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) {
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();
        //遍历数组1
        for (int i : nums1) {
            set1.add(i);
        }
        //遍历数组2的过程中判断哈希表中是否存在该元素
        for (int i : nums2) {
            if (set1.contains(i)) {
                resSet.add(i);
            }
        }

        //方法1：将结果集合转为数组

        return resSet.stream().mapToInt(x -> x).toArray();

        //方法2：另外申请一个数组存放setRes中的元素,最后返回数组
//        int[] arr = new int[resSet.size()];
//        int j = 0;
//        for(int i : resSet){
//            arr[j++] = i;
//        }
//        return arr;
    }
}
