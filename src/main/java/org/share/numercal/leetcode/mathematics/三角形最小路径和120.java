package org.share.numercal.leetcode.mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingbm on 2020/10/26 23:26
 */
public class 三角形最小路径和120 {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>(10);
        List<Integer> list1 = new ArrayList<>(1);
        list1.add(2);
        list.add(list1);
        List<Integer> list2 = new ArrayList<>(2);
        list2.add(3);
        list2.add(4);
        list.add(list2);
        List<Integer> list3 = new ArrayList<>(10);
        list3.add(6);
        list3.add(5);
        list3.add(7);
        list.add(list3);
        List<Integer> list4 = new ArrayList<>(10);
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        list.add(list4);

        System.out.println(minimumTotal(list));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.isEmpty()) {
            return 0;
        }
        int[] result = new int[triangle.get(triangle.size() - 1).size() + 1];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                result[j] = Math.min(result[j], result[j + 1]) + row.get(j);
            }
        }
        return result[0];
    }

}
