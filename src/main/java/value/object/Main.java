package value.object;

/**
 * @author Yeison Melo {@literal <mailto:melo.yeison@cabonline.com/>}
 */

public class Main {


    public static void main(String[] args) {

        Point p = new Point(5, 6);
        Point p2 = new Point(5, 6);
        if(p==p2) System.out.println("1. Points are equal");
        if(p.equals(p2)) System.out.println("2. Points are equal");

        PersonV femaleV = new PersonV("Anna", 15);
        PersonV femaleV2 = new PersonV("Anna", 15);
        if(femaleV==femaleV2) System.out.println("3. Females are equal");
        if(femaleV.equals(femaleV2)) System.out.println("4. Females are equal");

        Person female = new Person("Anna", 15);
        Person female2 = new Person("Anna", 15);
        if(!female.equals(female2)) System.out.println("5. Females are not are equal");
        if(female!=female2) System.out.println("6. Females are not are equal");

        if(!femaleV.equals(female)) System.out.println("7. Females are not are equal");

    }
}


