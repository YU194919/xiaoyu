package chapter11;
/**
 * 总结：
 * 到目前为止，你遇到的所有java程序，有顺序要求的是哪些?
 * 第一:对于一个方法来说，方法体中的代码是有顺序的，遵循自上而下的顺序执行。
 * 第二:静态代码块1和静态代码块2是有先后顺序的。
 * 第三:静态代码块和静态变量是有先后顺序的。
 */
public class StaticTest6 {
    //静态变量在类加载时初始化
    //静态变量存储在方法区
    static int i=100;

    //静态代码块在类加载时执行
    static{
        //这里可以访问i吗?可以
        System.out.println(i);

        
        //这里不能访问
        //静态代码块和静态变量都在类加载时候执行，时间相同，只能靠代码的顺序来决定先后
        //System.out.println(name);
    }
    //static String="zhangsan";
    public static void main(String[] args) {
        System.out.println("main begin!");
    }
}