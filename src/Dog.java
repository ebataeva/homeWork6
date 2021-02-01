public class Dog extends Animal {
static int countOfDog;


    public Dog(String name) {
        super(name);
        this.countOfDog++;

    }
    public static int getCount(){
        return countOfDog;
    }

    @Override
    void run(int distance) {
        if (distance>0 && distance <= 500) {
            System.out.printf("собака %s: я пробежала %d метров \n", name, distance);

        } else {
            System.out.printf("собака %s: я не могу столько пробежать, %d - это ту мач \n", name, distance);
        }
           }

    @Override
    void swim(int distance) {
if (distance <= 10 && distance >0){
    System.out.printf("собака %s: я проплыла %d метров \n", name, distance);

}else{
    System.out.printf("собака %s: я не могу столько проплыть, %d - это ту мач \n", name, distance);
}
    }


}
