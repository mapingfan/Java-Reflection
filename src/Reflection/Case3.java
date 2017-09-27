package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Case3 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("Reflection.Person");
        Constructor constructor =c.getDeclaredConstructor(String.class,int.class);
        Person person = (Person)constructor.newInstance("Aby",30);
        /*
           我们并没有直接new一个person对象，我们通过反射机制创造了对象。注意这个地方的强制转型。
         */
        /*person.setName("Max");
        person.setAge(30);*/
        System.out.println(person);
    }
}

class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;
    private int age;


}