package chapter11;
/**
 * 关于方法什么时候定义为静态方法，什么时候定义为实例方法？
 * 此方法一般都是描述了一个行为，如果说该行为必须由对象去触发.那么该方法定义为实例方法。
 * 
 * 参考标准:
 * 我们以后开发中，大部分情况下，如果是工具类的话，
 * 工具类当中的方法一般都是静态的。
 * (静态方法有一个优点，是不需要new对象，直接采用类名调用，
 * 极其方便。工具类就是为了方便，所以工具类中的方法一般都是static的。)
 * 
 * 什么是工具类?? ? ? ?
 * 以后讲。(工具类就是为了方便编程而开发的一些类。)
 * 
 * 类=属性+方法
 * 属性描述的是：状态
 * 方法描述的是：行为动作
 * 
 * 什么时候方法定义为实例方法?
 * 张三考试,得分90
 * 李四考试,得分100
 * 不同的对象参加考试的结果不同。
 * 我们可以认定"考试"这个行为是与对象相关的行为。建议将"考试"这个方法定义为实例方法。
 */
public class StaticTest4 {
    public static void main(String[] args) {
        User u=new User();
        System.out.println(u.getId());
    }
}
class User{
    //实例变量，需要对象
    private int id;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
}