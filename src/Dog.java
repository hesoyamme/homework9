public class Dog extends Animal {
    private Dog(String name) {
        super(name);
    }

    static Dog createrDog() {
        return new Dog("Sharik");
    }

    @Override
    void makeSound() {
        System.out.println("Гав-гав");
    }

    @Override
    void eat(String food) {
        if (food == "Meat") {
            System.out.println(name + " с удовольствием ест " + food);
        } else {
            System.out.println(name + " не доволен " + food);
        }
    }
}
