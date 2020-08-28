package Second;

import Base.Animal;
import Base.Jumping;

public class Dog extends Animal implements Jumping{
    String color;
    int age;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" + "color='" + color + '\'' + ", age=" + age + ", name='" + name + '\'' + '}';
    }

    public Dog(String name,String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

      public void dogInfo(){
          System.out.printf("Собака - %s, Цвет - %s, Возраст - %s\n",name,color,age);
      }

    @Override
    public void animalInfo() {
        dogInfo();
    }

    @Override
    public void voice() {
        System.out.println("Гав гав");
    }

    @Override
    public void jump2() {

    }

    @Override
    public void jump() {
        System.out.println(String.format("Dog '%s': jump",name));
    }
}
