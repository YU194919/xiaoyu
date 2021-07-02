package chapter11;

/**
 * this 
 * 1、this是一个关键字，全部小写
 * 
 * 2、this是什么，在内存方面是怎么样？ 一个对象一个this。 
 * this是一个变量，是一个引用。this保存当前对象的内存地址，指向自身。
 * 所以，严格意义上来说，this代表的就是"当前对象" this存储在堆内存当中对象的内部。
 * 
 * 3、this只能使用在实例方法和构造方法中。谁调用这个方法，this就是谁。 
 * 所以this代表的是:当前对象。
 * 
 * 
 */
public class ThisTest1 {
    public static void main(String[] args) {
        Customer c1 = new Customer("张三");
        Customer c2 = new Customer("李四");
    }
}

class Customer {
    // 属性
    // 实例变量
    String name;

    // 构造方法
    public Customer() {

    }

    public Customer(String s) {
        name = s;
    }
    // 顾客购物的方法
    // 实例方法
    public void shopping() {
        // 这里的this是淮?this是当前对象.
        // c1调用shopping () ,this是c1
        // c2调用shopping () ,this是c2
        // this．是可以省略的。
        // this．省略的话，还是默认访问"当前对象"的name.
        System.out.println(this.name + "正在购物");
    }

}
