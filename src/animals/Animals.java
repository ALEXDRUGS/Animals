package animals;

import java.util.Objects;

public abstract class Animals {
    private final String name;
    private final int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public abstract String eat();

    public abstract String sleep();

    public abstract String move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals that = (Animals) o;
        return Objects.equals(this.name, that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}

