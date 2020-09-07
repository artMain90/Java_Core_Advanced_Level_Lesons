package Lesson_1;

import Lesson_1_1.User;

public class UserApp{
    public static void main(String[] args) {
        doSomething();


    }

    private static void doSomething(){
        User user1 = User.create("Боря",44);
        user1.info();
    }
}
