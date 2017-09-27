package Reflection;

//通过反射获取完整的包名和类名；
public class Case1 {

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo.getClass().getName());
    }
}

class Demo {

}
