package com.example.leetcode.array;

/**
 *
 */
public class MaxRatioFinder {
    public static double getMax(int[] num) {

        if (num == null || num.length < 2) {
            throw new IllegalArgumentException("非法数组");
        }

        double radio = 0.0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                double current = (double) num[i] / num[j];
                radio = Math.max(radio, current);
            }
        }
        return radio;
    }


    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 5}; // 示例数组，假设已经排除了0
        // double maxRatio = findMaxRatio(nums);
        double maxRatio = getMax(nums);
        System.out.println("Max ratio: " + maxRatio); // 输出应该是3.0（因为3/1=3是最大值）
    }

    public static double findMaxRatio(int[] a) {
        int n = a.length;
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements to find a ratio.");
        }

        int left = 0;
        int right = 1;
        double maxDiv = Double.MIN_VALUE;

        while (right < n) {
            double div = (double) a[left] / a[right];
            maxDiv = Math.max(maxDiv, div);

            if (a[right] > a[left]) {
                left = right;
            }
            right++;
        }
        return maxDiv;
    }


}
