package Lesson_1;

public interface Jumping {
    default void jump2(){
        System.out.println("Кошка прыгнула дважды");
    }
    void jump();
}
