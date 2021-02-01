public class Cat extends Animal {
    static int countOfCat;

    public Cat(String name) {
        super(name);
        this.countOfCat++;
    }


    public int countCat() {
        return countOfCat;
    }

    @Override
    void run(int distance) {

        if (distance <= 200) {
            System.out.printf("кошка %s: я пробежала %d метров \n", name, distance);

        } else {
            System.out.printf("кошка %s: я не могу столько пробежать, %d - это ту мач \n", name, distance);
        }
    }

    @Override
    void swim(int distance) {
        System.out.println("кошка " + name + ": я не умею плавать, сорри \n");
    }


}
