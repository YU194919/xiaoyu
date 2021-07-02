package chapter11;
/**
 * 1、this可以使用在实例方法中，不能使用在静态方法中。
 * 2、this关键字大部分情况下可以省略，什么时候不能省略呢?
 * 在实例方法中，或者构造方法中，为了区分局部变量和实例变量，
 * 这种情况下: this.是不能省略的。
 * 
 */
public class ThisTest2 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setNo(111);
        s.setName("张三");
        System.out.println("学号"+s.getNo());
        System.out.println("姓名"+s.getName());

        Student s2=new Student(222,"李四");
        System.out.println("学号"+s2.getNo());
        System.out.println("姓名"+s2.getName());
    }
}
//分析一下程序存在什么问题
class Student{
    //学号
    private int no;
    //姓名
    private String name;
    
    //构造方法
    public Student() {
        
    }
    public Student(int no,String name) {
        this.no=no;
        this.name=name;
    }
    /*
        public void setNo(int i) {
        no = no;
    }
     */
    /*
        public void setNo(int no) {//就近原则
        no = no;//两个no都是实例方法里面的局部变量no,和实例变量no没关系
    }
    */
    public void setNo(int no) {
        this.no = no;
    }
    public int getNo() {
        return no;
    }
    /*
    public void setName(String s) {
       name = s;
    }
    */
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}