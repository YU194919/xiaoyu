package chapter11;
/**
 * 1、this除了能使用在实例方法中，还可以使用在构造方法中
 *
 * 2、通过当前的构造方法区调用另外一个构造方法，可以使用一下语法
 * this(实际参数列表)；
 *        通过一个构造方法1去调用构造方法2，可以做到代码复用。
 *        但需要注意的是:构造方法1和构造方法2都是在同一个类当中。
 * 
 * 3、this()的作用是什么？
 * 代码复用
 * 
 * 4、死记硬背
 * 对于this()的调用只能出现在构造方法的第一行。
 */
public class ThisTest3 {
    public static void main(String[] args) {
        Date d1=new Date();
        d1.detail();

        Date d2=new Date(2008,8,8);
        d2.detail();
    }
}
/*
1、定义一个日期类，可以表示年月日信息。
2、需求中要求:如果调用无参数构造方法，默认创建的日期为:1970年1月1日。
当然，除了调用无参数构造方法之外，也可以调用有参数的构造方法来创建日期对象。
*/
class Date{
    //年
    private int year;
    //月
    private int month;
    //日
    private int day;
    public Date() {
        /*
        this.year=1970;
        this.month=1;
        this.day=1;
         */
        this(1979, 1, 1);
    }
    public Date(int year,int month,int day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void detail() {
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}