package org.share.numercal.leetcode.mathematics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by xingbm on 2020/10/26 23:46
 */
public class 杨辉三角II119 {

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        Integer[] rows = new Integer[rowIndex + 1];
        rows[0] = 1;
        if(rowIndex > 0){
            rows[1] = 1;
        }

        for(int i = 2;i <= rowIndex; i++){
            for(int j = i - 1;j > 0;j--){
                rows[j] = rows[j] + rows[j - 1];
            }
            rows[i] = 1;

        }
        return Arrays.asList(rows);
    }

}
