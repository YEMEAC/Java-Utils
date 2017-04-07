package value.object;

/**
 * @author Yeison Melo {@literal <mailto:melo.yeison@cabonline.com/>}
 */

public class PersonV extends ValueObject {

    String name;
    int age;


    @Override
    public Object[] getFields() {
        Object properties[] = {name, age};
        return properties;
    }

    public PersonV(String name, int age) {
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
