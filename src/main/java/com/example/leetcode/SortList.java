package com.example.leetcode;

import java.util.Arrays;

/**
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 * 输入：head = [-1,5,3,4,0]
 * 输出：[-1,0,3,4,5]
 * 输入：head = []
 * 输出：[]
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        if (null == head)
            return null;

        int num = 0;
        while (null != head) {
            num++;
            head = head.next;
        }


        int[] array = new int[num];
        int index = 0;
        while (null != head) {
            array[index] = head.val;
            index++;
            head = head.next;
        }
        Arrays.sort(array);
        ListNode newNodeHead  = new ListNode(0);
        ListNode cur = newNodeHead;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            cur.next = new ListNode(value);
            cur= cur.next;
        }
        return newNodeHead;
    }

    public static void main(String[] args) {
        SortList solution = new SortList();

        // 创建测试链表
        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);


        // 调用方法得到结果
        ListNode result = solution.sortList(l1);

        // 输出结果链表
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}
