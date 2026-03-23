package chapter11.ex7_class;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();
        System.out.println(aClass.getName());
        Class<Person> personClass = Person.class;
        System.out.println(personClass.getName());

        Class<?> aClass1 = Class.forName("chapter11.ex7_class.Person");
        System.out.println(aClass1.getName());



    }
}
