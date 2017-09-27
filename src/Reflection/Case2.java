package Reflection;

public class Case2 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;

        c1 = Demo2.class;  //以类名的静态属性获得Class类的对象。
        c2 = new Demo2().getClass(); //通过类的对象的函数获得Class类的对象。
        c3 = Class.forName("Reflection.Demo2"); //一无所知情况下通过forName方法+包名+类名获得Class对象。

        System.out.println("类名称   " + c1.getName());
        System.out.println("类名称   " + c2.getName());
        System.out.println("类名称   " + c3.getName());
    }
}
//三种方法。
class Demo2 {

}
