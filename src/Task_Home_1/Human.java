package Task_Home_1;

public class Human extends View {


    public Human(String name,int toRun, int toJump) {
        super(name,toRun, toJump);
    }

    @Override
    public void behaviorInfo() {
        super.behaviorInfo();

    }

    public void printHuman(){
        System.out.printf("Имя человека - %s, Бег - %d, Прыжок - %d\n",name,toRun,toJump);
    }

}
