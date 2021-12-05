package HomeWork7;

public class Dog extends SomeAnimals {

    String name;
    int dist;
    public int run;
    public int swim;

    public Dog(String бобик) {

    }

    public void Dog(String name) {
        this.name = name;
    }
    public void run(int run) {
        dist = 500;
        if(dist <= run ){
            System.out.println(name + " пробежал: " + dist + " м.");
        }
        else {
            System.out.println(name + " не может столько бежать");
        }
    }
    public void swim(int swim) {
        dist = 10;
        if(dist <= swim) {
            System.out.println(name + " проплыл: " + dist + " м.");
        }
        else {
            System.out.println(name + " не может столько проплыть");
        }
    }

}
