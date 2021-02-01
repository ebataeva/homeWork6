public class Main {
    public static void main(String[] args) {


        System.out.println();
        Cat marysa = new Cat("Маруся");
        marysa.run(400);
        Dog dogBenya = new Dog("Беня");
        Dog dogMisha = new Dog("Миша");
        Cat catBelik = new Cat("Белкв");
        Cat catZina = new Cat("Зина");
        System.out.println("всего животных " + Animal.getCount());
        System.out.println("всего собак "+Dog.getCount());
        System.out.println("всего кошек "+ Cat.getCount());
        dogMisha.swim(10);
        catZina.run(4);
        catBelik.swim(3);
        dogBenya.run(15);


    }

}
