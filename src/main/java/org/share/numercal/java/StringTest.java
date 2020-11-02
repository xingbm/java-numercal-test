package org.share.numercal.java;

/**
 * Created by xingbm on 2020/10/15 7:26
 */
public class StringTest {

    private static final String MESSAGE = "taobao";

    public static void main(String[] args) {
        String s = "hello";
        String t = "hello";
        char[] c = {'h','e','l','l','o'};
        System.out.println("s.equals(t):" + s.equals(t));
        System.out.println("t.equals(c):" + t.equals(c));
        System.out.println("s==t:" + (s == t));

        System.out.println("---------------------------------------------");

        String a = "tao" + "bao";
        String b = "tao";
        String c1 = "bao";
        System.out.println("a=MESSAGE:" + (a == MESSAGE));
        System.out.println("(b+c1) == MESSAGE:" + ((b+c1) == MESSAGE));

    }

}
