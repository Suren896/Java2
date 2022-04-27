package practice1;

public class Cat implements Jump, Run {
    protected String name;
    protected int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int jumping() {
        return 15;
    }

    @Override
    public int running() {
        return 55;
    }

    @Override
    public String toString() {
        return name ;
    }
}
