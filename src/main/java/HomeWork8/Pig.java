package HomeWork8;

public class Pig extends Animals {

    public static final String piggy = "свинка";

    public Pig() {
        super(piggy);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " умеет хрюкать");
    }
}
