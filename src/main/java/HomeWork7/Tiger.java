package HomeWork7;

public class Tiger extends SomeAnimals {
    String name = "тигр";
    int dist;
    public int run;
    public int swim;

    public Tiger(String тигр) {

    }

    public void Tiger(String name) {
        this.name = name;
    }
    public void run(int run) {
        dist = 600;
        if(dist <= run ){
            System.out.println(name + " пробежал: " + dist + " м.");
        }
        else {
            System.out.println(name + " не может столько бежать");
        }
    }
    public void swim(int swim) {
        dist = 100;
        if(dist <= swim) {
            System.out.println(name + " проплыл: " + dist + " м.");
        }
        else {
            System.out.println(name + " не может столько проплыть");
        }
    }

}
