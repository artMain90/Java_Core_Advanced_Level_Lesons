package Task_Home_1;

import Lesson_1_1.Dog;

public class RunApp {
    public static void main(String[] args) {


        View[] views = new View[3];
        views[0] = new Cat("Жора",10,3);


        runCat();
        runHuman();
        runRobot();


    }

    public static void runCat(){
        Cat cat1 = new Cat("Жора",10,3);
        Track track1 = new Track(15);
        Build build1 = new Build(2);

        if (cat1.toRun < track1.distanceTrack){
            System.out.println("Кот смог пробежать");
        }else {
            System.out.println("Кот не смог пробежать");
        }
        if (cat1.toJump < build1.heightBuild){
            System.out.println("Кот смог перепрыгнуть здание");
        }else {
            System.out.println("Кот не смог перепрыгнуть здание");
        }

        cat1.printCat();
    }



    public static void runHuman(){
        Human human1 = new Human("Сергей",20,2);
        Track track2 = new Track(15);
        Build build2 = new Build(2);

        if (human1.toRun < track2.distanceTrack){
            System.out.println("Кот смог пробежать");
        }else {
            System.out.println("Кот не смог пробежать");
        }
        if (human1.toJump < build2.heightBuild){
            System.out.println("Кот смог перепрыгнуть здание");
        }else {
            System.out.println("Кот не смог перепрыгнуть здание");
        }

        human1.printHuman();
    }


    public static void runRobot(){
        Robot robot1 = new Robot("Gen",50,0);
        Track track3 = new Track(15);
        Build build3 = new Build(2);

        if (robot1.toRun < track3.distanceTrack){
            System.out.println("Кот смог пробежать");
        }else {
            System.out.println("Кот не смог пробежать");
        }
        if (robot1.toJump < build3.heightBuild){
            System.out.println("Кот смог перепрыгнуть здание");
        }else {
            System.out.println("Кот не смог перепрыгнуть здание");
        }
        robot1.printRobot();
    }



}
