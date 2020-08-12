package Lesson_1;
import java.util.Objects;
public class Cat extends Animal implements Jumping,Run{
    protected String color;
    protected int age;

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

    public Cat(){
    }

    public Cat(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public Cat(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public void catInfo(){
        System.out.printf("Кошка. Имя: %s. Цвет: %s. Возраст: %d\n",name,color,age);
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }

    @Override
    public void jump() {
        System.out.println(String.format("Cat '%s': jump! ",name));
    }

    @Override
    public void toRun() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;//Оператор instanceof нужен, чтобы проверить, был ли объект,---
        //--- на который ссылается переменная X, создан на основе какого-либо класса Y.
        Cat cat = (Cat) o;
        if (age != cat.age) return false;
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" + "color='" + color + '\'' + ", age=" + age + ", name='" + name + '\'' + '}';
    }

    public CatReader createReader(){//внутренний класс.
        return new CatReader();
    }

    public class CatReader{
        public String getCat(){
          return String.format("Кошка!!!. Имя: %s. Цвет: %s. Возраст: %d\n",name,color,age);
        }
    }
}
