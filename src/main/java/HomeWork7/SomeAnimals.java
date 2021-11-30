package HomeWork7;

public class SomeAnimals {
    /* Создать классы:
    Собака, Домашний Кот, Тигр
    • Животные могут бежать и плыть. В качестве аргумента каждому  методу передается
    длина препятствия.
    • У каждого животного есть ограничения на действия
    (бег: кот — 200 м, собака — 500 м, тигр - 700;
    плавание: кот — не умеет плавать, собака  — 10 м, тигр - 150м).
    Результатом выполнения действия будет печать в  консоль.
    Например: dogBobik.run(150); -> 'Бобик пробежал 150  м'
     */

    public static void main(String[] args) {

        Dog DogBobik = new Dog("Бобик");
        DogBobik.run = 500;
        DogBobik.swim = 10;

        Cat CatKuzya = new Cat("Кузя");
        CatKuzya.run = 200;
        CatKuzya.swim =0;

        Tiger Tiger = new Tiger("Тигр");
        Tiger.run = 700;
        Tiger.swim = 150;

    }
}
