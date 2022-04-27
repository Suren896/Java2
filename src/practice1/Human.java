package practice1;

public class Human implements Jump, Run {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int jumping() {
        return 8;
    }

    @Override
    public int running() {
        return 25;
    }

    @Override
    public String toString() {
        return name;
    }
}