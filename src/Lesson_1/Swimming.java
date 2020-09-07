package Lesson_1;

public interface Swimming{

    default void swim2(){
        System.out.println("Кошка плывет дважды");
    }
    void swim();
}
