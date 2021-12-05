package HomeWork8;

public class Dog extends Animals {

    public static final String doggy = "овчарка";

    public Dog() {
        super(doggy);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " умеет гавкать");
    }
}
