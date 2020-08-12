package Lesson_1;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Барсик","Белый",5);
        animals[1] = new Dog("Барбос","Черный",10);

        for (Animal animal : animals) {
            animal.animalInfo();
            animal.voice();

            if (animal instanceof Jumping){//Оператор instanceof проверяет animal наследуется от Интерфейса---
                //--- Jumping, и дает команду выполнить метод Jump, если условия проверки истинно.
                ((Jumping)animal).jump();
            }
        }
    }
}
