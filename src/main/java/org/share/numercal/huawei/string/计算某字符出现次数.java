package org.share.numercal.huawei.string;

import java.io.IOException;
import java.util.Scanner;

/**
 * 说明:计算某字符出现次数
 *
 * @author xingbm25710; <xingbm25710@yunrong.cn>;
 * @version v 1.0, 2022/8/11 17:01 xingbm25710 Exp $$
 * @since 1.0
 * hsjry.com Inc.
 * Copyright (c) 2015-2022 All Rights Reserved.
 */
public class 计算某字符出现次数 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String s = sc.nextLine().toLowerCase();
        System.out.print(str.length() - str.replaceAll(s, "").length());
    }

}
