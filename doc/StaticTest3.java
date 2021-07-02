package chapter11;
/**
 * 实例的：一定要使用“引用.”来访问
 * 静态的：建议使用“类名.”方式来访问，但是也可以用“引用.”来访问
 *         最好使用“类名.”方式来访问，防止使其他程序员困惑
 * 结论:
 * 空指针异常只有在什么情况下才会发生呢?
 * 只有在"空引用"访问实例"相关的，都会出现空指针异常。
 */
public class StaticTest3 {
    public static void main(String[] args) {
        //直接访问静态变量
        System.out.println(Chinese.country);

        //创建对象
        Chinese1 p=new Chinese1("1111","张三");
        System.out.println(p.idCard);
        System.out.println(p.name);
        //引用点访问静态变量
        System.out.println(p.country);

        //p是空引用
        p=null;
        //这里会出现空指针异常吗？
        //不会出现空指针异常
        //因为静态变量不需要对象的存在
        //实际代码在运行的时候，还是 System.out.println(Chinese.country);
        System.out.println(p.country);

    }
}
class Chinese1{
    //实例变量
    String idCard;
    String name;
    //静态变量
    static String country="中国";
    public Chinese1(){

    }
    public Chinese1(String s1,String s2){
        idCard=s1;
        name=s2;
    }
}