package day01;

public class Actor {
    private String name;
    private int birth;

    public Actor(String name, int birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public int getBirth() {
        return birth;
    }
}
