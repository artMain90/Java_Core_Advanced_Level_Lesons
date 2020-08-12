package Lesson_1;

public class CatDemoApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик","Коричневый",4);
        Cat cat2 = new Cat();

        cat1.setName("Барик");
        cat1.setColor("Белый");
        cat1.setAge(4);

        cat2.setName("Мурзик");
        cat1.color = "Красный";

        cat1.animalInfo();
        cat2.animalInfo();

        System.out.println(cat1.toString());//выведет хэш-код.Но если переопр метод toString у Cat,то норм.

        Cat.CatReader catReader = cat1.createReader();
        System.out.println(catReader.getCat());


    }

}
