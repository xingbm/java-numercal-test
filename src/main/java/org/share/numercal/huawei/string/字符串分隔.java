package org.share.numercal.huawei.string;

import java.io.IOException;
import java.util.Scanner;

/**
 * 说明:字符串分隔
 *
 * @author xingbm25710; <xingbm25710@yunrong.cn>;
 * @version v 1.0, 2022/8/11 17:14 xingbm25710 Exp $$
 * @since 1.0
 * hsjry.com Inc.
 * Copyright (c) 2015-2022 All Rights Reserved.
 */
public class 字符串分隔 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str;
        while(sc.hasNext()) {
            str = sc.nextLine();
            while (str.length() > 8) {
                System.out.println(str.substring(0,8));
                str = str.substring(8);
            }
            str = str + "00000000";
            System.out.println(str.substring(0,8));
        }
    }

}
