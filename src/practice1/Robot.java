package practice1;

public class Robot implements Jump, Run {
    protected String name;
    protected int age;

    public Robot(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int jumping() {
        return 5;
    }

    @Override
    public int running() {
        return 15;
    }

    @Override
    public String toString() {
        return name ;
    }
}
