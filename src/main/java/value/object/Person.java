package value.object;

/**
 * @author Yeison Melo {@literal <mailto:melo.yeison@cabonline.com/>}
 */

public class Person {

    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
