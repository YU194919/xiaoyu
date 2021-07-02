package chapter11;

/**
 * static: 
 * 1、static翻译为"静态" 
 * 2、所有static关键字修饰的都是类相关的，类级别的.
 * 3、所有static修饰的，都是采用"类名."的方式访问。
 * 4、static修饰的变量:静态变量
 *  5、static修饰的方法:静态方法
 * 
 * 变量的分类: 变量根据声明的位置进行划分: 
 * 在方法体当中声明的变量叫做:局部变量。 
 * 在方法体外声明的变量叫做:成员变量。
 * 
 * 成员变量又可以分为: 实例变量 静态变量
 * 
 */
class VarTest {
    //一下都用“引用.”调用，存在空指针异常
    // 成员变量中的实例变量
    int i;
    // 实例方法
    public void doOther() {

    }

    
    //一下静态的都用“类名.”调用
    // 成员变量中的静态变量
    static int a;
    // 静态方法
    public static void doSome() {

    }

}