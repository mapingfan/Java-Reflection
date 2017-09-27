public class TestDynamicLoading {

    public static void main(String[] args) {
        new A();
        System.out.println("-----------------");
        new B();
        new C();
        new C();

        new D();
        new D();

    }
}

class A {

}

class B {

}
//不是一次性加载完毕，而是遇到一个就classloader就加载一个。
class C {
    static {
        System.out.println("cccccccccccccccccccc");
    }
}

//静态语句快。
class D {
    {
        System.out.println("DDDDDDDDDDDDDDDDDD");
    }
}
//动态语句块；