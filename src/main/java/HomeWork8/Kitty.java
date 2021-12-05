package HomeWork8;

    public class Kitty extends Animals {

        public static final String kotik = "Котенок";

        public Kitty() {
            super(kotik);
        }

        @Override
        public void voice() {
            System.out.println(this.name + " умеет мяукать");
        }
    }

