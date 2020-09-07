package Task_Home_1;

public class Cat extends View {

    public Cat(String name, int toRun, int toJump) {
        super(name, toRun, toJump);
    }

    @Override
    public void behaviorInfo() {
        super.behaviorInfo();

    }

    public void printCat(){
        System.out.printf("Имя кота - %s, Бег - %d, Прыжок - %d\n",name,toRun,toJump);
    }


}
