package org.share.numercal.huawei.string;

import java.util.Scanner;

/**
 * 说明:1.字符串最后一个单词的长度
 *
 * @author xingbm25710; <xingbm25710@yunrong.cn>;
 * @version v 1.0, 2022/8/11 16:36 xingbm25710 Exp $$
 * @since 1.0
 * hsjry.com Inc.
 * Copyright (c) 2015-2022 All Rights Reserved.
 */
public class 字符串最后一个单词的长度 {

    public static void main(String [] args) throws Exception{
        // 方法1：使用lastIndexOf与substring方法
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(str.lastIndexOf(" ")+1, str.length());
        System.out.print(str.length());
    }

}
