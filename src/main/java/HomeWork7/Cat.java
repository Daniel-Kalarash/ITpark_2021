package HomeWork7;

public class Cat {
    String name;
    int dist;
    public int run;
    public int swim;

    public Cat(String name) {
        this.name = name;
    }

    public void run(int run) {
        dist = 150;
        if(dist <= run ){
            System.out.println(name + " пробежал: " + dist + " м.");
        }
        else {
            System.out.println(name + " не может столько бежать");
        }
    }

    public void swim(int swim) {
        System.out.println(name + " не умеет плавать!");
    }
}
