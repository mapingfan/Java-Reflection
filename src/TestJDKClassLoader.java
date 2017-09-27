public class TestJDKClassLoader {

    public static void main(String[] args) {
        /*System.out.println(String.class.getClassLoader()); //最核心的类loader，无法打印名字。
        System.out.println(com.sun.crypto.provider.AESKeyGenerator.class.getClassLoader().getClass().getName());
        System.out.println(TestJDKClassLoader.class.getClassLoader().getClass().getName()); //自定义类的loader。
        System.out.println(ClassLoader.getSystemClassLoader().getClass().getName());*/
        ClassLoader classLoader = TestJDKClassLoader.class.getClassLoader();
        while (classLoader!=null) {
            System.out.println(classLoader.getClass().getName());
            classLoader = classLoader.getParent();
        }
    }
}
