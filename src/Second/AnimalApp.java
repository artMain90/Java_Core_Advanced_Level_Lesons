package Second;

import Base.Animal;
import Base.Jumping;

public class AnimalApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat("Барсик","Коричневый",4);
        animals[1] = new Dog("Барбос","Черный",10);

        for (Animal animal : animals) {
            animal.animalInfo();
            animal.voice();

            if (animal instanceof Jumping){
                ((Jumping) animal).jump();
            }
        }

    }
}
