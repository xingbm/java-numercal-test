package org.share.numercal.huawei.string;

import java.io.IOException;
import java.util.Scanner;

/**
 * 说明:进制转换
 *
 * @author xingbm25710; <xingbm25710@yunrong.cn>;
 * @version v 1.0, 2022/8/11 17:35 xingbm25710 Exp $$
 * @since 1.0
 * hsjry.com Inc.
 * Copyright (c) 2015-2022 All Rights Reserved.
 */
public class 进制转换 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s = sc.nextLine();
            int result = Integer.parseInt(s.substring(2,s.length()), 16);
            System.out.print(result);
        }

    }

}
