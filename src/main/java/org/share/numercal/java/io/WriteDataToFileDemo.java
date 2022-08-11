package org.share.numercal.java.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 说明:
 * 写入一个字符串到指定文件
 * 把数据追加到文件中
 *
 * @author xingbm25710; <xingbm25710@yunrong.cn>;
 * @version v 1.0, 2022/8/11 10:28 xingbm25710 Exp $$
 * @since 1.0
 * hsjry.com Inc.
 * Copyright (c) 2015-2022 All Rights Reserved.
 */
public class WriteDataToFileDemo {

    public static void main(String[] args) {
        // 使用FileWriter
        // fileWriter();
        // 使用FileOutPutStream
        // fileOutputStream();
        // 使用FileOutPutStream追加写入文件
        fileOutputStreamAddFile();
    }

    /**
     * 使用FileWriter
     */
    private static void fileWriter() {
        String str = "hello world!";
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter("D://add_String_to_file.txt");
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Write File error" + e.getMessage());
        }
    }

    /**
     * 使用FileOutPutStream
     */
    private static void fileOutputStream() {
        String str = "hello world!";
        File file = new File("D://file.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] bytes = new byte[20];
            bytes = str.getBytes();
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(bytes);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.out.println("Write file error" + e.getMessage());
        }
    }

    /**
     * 使用FileOutPutStream追加写入文件
     */
    private static void fileOutputStreamAddFile() {
        String str = "hello world!";
        File file = new File("D://file.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            byte[] bytes = new byte[20];
            bytes = str.getBytes();
            FileOutputStream fos = new FileOutputStream(file, true);
            fos.write(bytes);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            System.out.println("Write file error" + e.getMessage());
        }
    }

}
