public class Tiger extends Animal {
    public Tiger(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("Хорошо сидим");
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
