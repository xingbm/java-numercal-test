package org.share.numercal.huawei.string;

import java.io.IOException;
import java.util.BitSet;
import java.util.Scanner;

/**
 * 说明:字符个数统计
 *
 * @author xingbm25710; <xingbm25710@yunrong.cn>;
 * @version v 1.0, 2022/8/11 17:36 xingbm25710 Exp $$
 * @since 1.0
 * hsjry.com Inc.
 * Copyright (c) 2015-2022 All Rights Reserved.
 */
public class 字符个数统计 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        // 总共有128个字符。字需要用128位
        BitSet bitSet = new BitSet(128);
        for (char c : line.toCharArray()) {
            // 判断字符c是否已经出现
            if (!bitSet.get(c)) {
                // 未出现就设置为已出现
                bitSet.set(c);
            }
        }
        // 统计有多少字符已出现过
        System.out.print(bitSet.cardinality());
    }

}
