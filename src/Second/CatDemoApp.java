package Second;

public class CatDemoApp {
    public static void main(String[] args) {


        Cat cat1 = new Cat("Барсик","Коричневый",4);
        Cat cat2 = new Cat();

        cat2.setName("Мурзик");
        cat2.color = "Черный";
        cat2.age = 6;
        cat1.setEyes(3);

        cat1.animalInfo();
        cat2.animalInfo();
        cat1.jump();
        cat2.jump();
        cat1.swim();
        cat1.swim2();
        System.out.println(cat1.toString());

        Cat.CatReader catReader = cat1.createReader();
        System.out.println(catReader.getCanInfo());

    }
}
