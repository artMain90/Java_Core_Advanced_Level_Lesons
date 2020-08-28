package Second;

import Base.Animal;
import Base.Jumping;
import Base.Swimming;

import java.util.Objects;

public class Cat extends Animal implements Jumping, Swimming {
    int eyes = 5;
    String color;
    int age;

    public int getEyes() {
        return eyes;
    }


    public void setEyes(int eyes) {
        this.eyes = eyes;
    }



    public Cat(){

    }

    public Cat(String color,int age){
        this.color = color;
        this.age = age;
    }

    public Cat(String name,String color,int age){
        super(name);
        this.color = color;
        this.age = age;
    }

    public void catInfo(){
        System.out.printf("Кошка.Имя: %s. Цвет: %s. Возраст: %d\n",name,color,age);
    }


    @Override
    public void animalInfo() {
        super.animalInfo();
        catInfo();
    }

    @Override
    public String toString() {
        return "Cat{" + "eyes=" + eyes + ", color='" + color + '\'' + ", age=" + age + ", name='" + name + '\'' + '}';
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public void jump() {
        System.out.println(String.format("Cat  '%s': jump",name));
    }

    @Override
    public void swim() {
        System.out.println("Кошка плывет");
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return eyes == cat.eyes && age == cat.age && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eyes, color, age);
    }

    public CatReader createReader(){
        return new CatReader();
    }

    public class CatReader{
        public String getCanInfo(){
            return String.format("Кошка.Имя: %s. Цвет: %s. Возраст: %d\n",name,color,age);
        }
    }
}
