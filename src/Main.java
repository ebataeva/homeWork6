import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        System.out.println();
        Cat marysa = new Cat("Marysa");
        marysa.run(400);
        Dog dogBenya = new Dog("Беня");
        Dog dogMisha = new Dog("Миша");
        Cat catBelik = new Cat("Белик");
        Cat catZina = new Cat("Зина");
        System.out.println("всего животных " + marysa.count());
        System.out.println("всего собак "+dogBenya.countDog());
        System.out.println("всего кошек "+ catZina.countCat());
        dogMisha.swim(10);
        catZina.run(4);
        catBelik.swim(3);


    }

}
