package HomeWork8;

public class AnimRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Kitty kitty = new Kitty();
        Pig pig = new Pig();

        Animals[] animals = new Animals[] {dog, kitty, pig};
        for (Animals animal: animals) {
            animal.voice();
        }
    }

}

