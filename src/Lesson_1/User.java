package Lesson_1;

public class User {

    private int id;
    private String name;
    private String position;
    private int age;

    public User(int id, String name, String position, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.age = age; //тут можно написать setAge(age);, в кот есть какие то логические операции.
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static User create(String name, int age){

        return new User(name,age);
    }

    public void setAge(int age){
        if (age < 0)throw new IllegalArgumentException("Age con not be negative number");
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void info(){
        System.out.println("id: " + id + "; Имя пользователя: " + name + "; Должность: " + position + "; Возраст: " + age);
    }

    public static String type(){ //static позволяет вызвать этот метод в main, через класс User.
        return "human";
    }

    public static void main(String[] args) {
           User user = new User(1,"Test user","Executive chairman",43);
           user.info();
           user.setAge(55);
        System.out.println("Возраст: " + user.getAge());
        System.out.println("Тип: " + User.type());
    }

}
