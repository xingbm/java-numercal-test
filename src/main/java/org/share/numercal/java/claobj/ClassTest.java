package org.share.numercal.java.claobj;

/**
 * Created by xingbm on 2021/1/22 7:07
 * 一般顺序：静态块（静态变量）——>成员变量——>构造方法——>静态方法
 * 1、静态代码块（只加载一次） 2、构造方法（创建一个实例就加载一次）3、静态方法需要调用才会执行，所以最后结果没有e
 *
 */
public class ClassTest { //1.第一步，准备加载类

    private static String param = "aaa"; //2.第二步，静态变量和静态代码块的加载顺序由编写先后决定

    {
        param = "eee";
        System.out.println(param);
    }

    int a = 5; //5.第五步，按照顺序加载变量

    { //6.第六步，按照顺序加载匿名代码块
        a = a + 1;
        System.out.println(a);
    }

    public ClassTest () { //7.第七步，最后加载构造函数，完成对象的建立
        param = "bbb";
        System.out.println(param);
    }

    static { // 3.第三步，静态块，然后执行静态代码块
        param = "ccc";
        System.out.println(param);
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        ClassTest.param = param;
    }

    static void run() // 静态方法，调用的时候才加载// 注意看，e没有加载
    {
        System.out.println("e");
    }

    public static void main(String[] args) {
        ClassTest classTest = new ClassTest(); //4.第四步，new一个类，但在new之前要处理匿名代码块
        classTest.setParam("ddd"); //8.调用set方法
        System.out.println(param);
    }

}
