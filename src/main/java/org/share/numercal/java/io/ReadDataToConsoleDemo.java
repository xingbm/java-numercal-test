package org.share.numercal.java.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 说明:读取一个文件中的数据并以字符串的形式展示在控制台
 *
 * @author xingbm25710; <xingbm25710@yunrong.cn>;
 * @version v 1.0, 2022/8/11 10:12 xingbm25710 Exp $$
 * @since 1.0
 * hsjry.com Inc.
 * Copyright (c) 2015-2022 All Rights Reserved.
 */
public class ReadDataToConsoleDemo {

    public static void main(String[] args) {
        try {
            File file = new File("D:", "text.txt");
            InputStream is = new FileInputStream(file);
            int count = 0;
            while (count == 0) {
                count = is.available();
            }
            byte[] b = new byte[count];
            int n = is.read(b);
            System.out.println(new String(b,0, n));
        } catch (IOException e) {
            System.out.println("File read Error" + e.getMessage());
        }
    }

}
