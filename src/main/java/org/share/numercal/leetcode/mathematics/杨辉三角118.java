package org.share.numercal.leetcode.mathematics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xingbm on 2020/10/26 23:40
 */
public class 杨辉三角118 {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> innerList;
        for (int i = 0; i < numRows; i++) {
            innerList = new ArrayList<>();
            if (i == 0) {
                innerList.add(1);
            } else {
                List<Integer> prevList = list.get(i - 1);
                // 下标变成行数要+1, 行数等于该行的元素个数
                for (int j = 0; j < i + 1; j++) {
                    innerList.add(get(prevList, j) + get(prevList, j - 1));
                }
            }
            list.add(innerList);
        }
        return list;
    }

    // 辅助函数, 处理了数组下标越界的问题
    private static int get(List<Integer> list, int index){
        if (index < 0 || index >=list.size()) {
            return 0;
        } else {
            return list.get(index);
        }
    }

}
