public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Пик-ми");
    }

    @Override
    void eat(String food) {
        if (food == "Grass") {
            System.out.println(name + " с удовольствием ест " + food);
        } else {
            System.out.println(name + " не доволен " + food);
        }
    }
}
