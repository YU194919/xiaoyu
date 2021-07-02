package chapter11;
/**
 * 1、除了静态代码块之外，还有一种语句叫做：实例语句块
 * 
 * 2、实例语句在类加载时候不执行
 * 
 * 3、实例语句块语法？
 * {
 *    java语句；
 *    java语句；
 *    java语句；
 * }
 * 
 * 4、实例语句块在什么时候执行？
 * 只要构造方法执行，必然在构造方法执行之前执行实例语句块
 * 实际上这也是SUN公司为java程序员准备一个特殊的时机，叫做对象构建时机。

 */
public class InstanceCode {
    public static void main(String[] args) {
        System.out.println("main begin!");
        new InstanceCode();
        new InstanceCode();

        new InstanceCode("ads");
    }

    //实例语句块
    {
        System.out.println("实例语句块执行");
    }

    public InstanceCode() {
        System.out.println("无参数的构造方法！");
    }

    public  InstanceCode(String name) {
        System.out.println("有参数的构造方法！");
    }
}