package org.share.numercal.java;

/**
 * Created by xingbm on 2020/10/13 7:46
 */
public class MultiplicationTable {

    public static void main(StringTest[] args) {
        System.out.println("乘法口诀表：");
        for (int i=1;i<=9;i++) {
            for (int j=1;j<=i;j++) {
                System.out.println(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }

}
