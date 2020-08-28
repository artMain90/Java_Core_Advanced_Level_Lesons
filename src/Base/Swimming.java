package Base;

import org.omg.CORBA.Object;

public interface Swimming{

    default void swim2(){
        System.out.println("Кошка плывет дважды");
    }
    void swim();
}
