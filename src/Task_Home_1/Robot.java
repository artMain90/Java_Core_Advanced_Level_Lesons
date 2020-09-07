package Task_Home_1;

public class Robot extends View {

    public Robot(String name, int toRun, int toJump) {
        super(name, toRun, toJump);
    }

    @Override
    public void behaviorInfo() {
        super.behaviorInfo();

    }

    public void printRobot(){
        System.out.printf("Имя робота - %s, Бег - %d, Прыжок - %d\n",name,toRun,toJump);
    }

}
