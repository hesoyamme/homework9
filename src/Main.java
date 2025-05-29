public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                Dog.creatorDog(),
                new Tiger("Tigran"),
                new Rabbit("Jo-jo")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].eat("Meat");
            animals[i].makeSound();
        }
    }
}