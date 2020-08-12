package Lesson_1;

public class Dog extends Animal implements Jumping{
    private String color;
    private int age;
    public Dog(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public Dog(String name, String color, int age) {
        super(name);
        this.color = color;
        this.age = age;
    }

public void dogInfo(){
        System.out.printf("Собака. Имя: %s. Цвет: %s. Возраст: %d\n",name,color,age);
}

    @Override
    public void animalInfo() {
        dogInfo();
    }

    @Override
    public void voice() {
    }

    @Override
    public void jump() {
        System.out.println(String.format("Dog '%s': jump! ",name));
    }

    @Override
    public String toString() {
        return "Dog{" + "color='" + color + '\'' + ", age=" + age + ", name='" + name + '\'' + '}';
    }
}
