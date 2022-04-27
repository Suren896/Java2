package practice1;

public class Action {

    public static void main(String[] args) {

        Cat cat = new Cat("Tom", 7);
        Human human = new Human("Andrey", 34);
        Robot robot = new Robot("Vasiliy", 4);
        Wall wall = new Wall(10);
        Treadmill treadmill = new Treadmill(20);

        jumpOverWall(wall, cat, human, robot);
        runAccrossRoad(treadmill, cat, human, robot);


    }

    public static void jumpOverWall (Wall wall, Jump...jumps){
        for (Jump jump : jumps) {
            if (wall.height <= jump.jumping()){
                System.out.println(jump + " перепрыгнул cтенку");
            } else {
                System.out.println(jump + " не смог перепрыгнуть cтенку");
            }
            System.out.println("-------");
        }
    }

    public static void runAccrossRoad (Treadmill treadmill, Run...runs){
        for (Run run : runs) {
            if (treadmill.length <= run.running()){
                System.out.println(run + " пробежал всю дистанцию");
            } else {
                System.out.println(run + " не смог пробежать всю дистанцию");
            }
            System.out.println("-------");
        }
    }
}
