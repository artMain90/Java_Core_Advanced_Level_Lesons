package Task_Home_1;

public abstract class View {
    protected int toRun = 30;
    protected int toJump;
    protected String name;

    public View(String name, int toRun, int toJump) {
        this.name = name;
        this.toRun = toRun;
        this.toJump = toJump;
    }

    public void behaviorInfo(){
        System.out.println("Вид: " + name);
    }


}
