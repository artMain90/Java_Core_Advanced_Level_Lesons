package Lesson_2;

public class PlayWithFinally {
    public static void main(String[] args) {
        finallyPriority();
    }

    public static void finallyPriority(){
        try {
            System.out.println("In Try");
            throw new RuntimeException("Oops!");
        } finally {
            System.out.println("In finally");
            throw new RuntimeException("Broken is finally");
        }
    }
}
