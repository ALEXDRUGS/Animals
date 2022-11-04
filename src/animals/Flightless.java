package animals;

public class Flightless extends Birds{
    private String movementType;

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
    }

    @Override
    public String hunt() {
        return null;
    }

    @Override
    public String getLivingEnvironment() {
        return super.getLivingEnvironment();
    }

    @Override
    public void setLivingEnvironment(String livingEnvironment) {
        super.setLivingEnvironment(livingEnvironment);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String eat() {
        return super.eat();
    }

    @Override
    public String sleep() {
        return super.sleep();
    }

    @Override
    public String move() {
        return super.move();
    }
    @Override
    public String toString() {
        return "  Птица " + getName() + "  Возраст " + getAge() +
                " лет  Среда обитания " + getLivingEnvironment() + " Способ передвижения " + getMovementType();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if (movementType != null && !movementType.isEmpty() && !movementType.isBlank()) {
            this.movementType = movementType;
        }
    }

    public String walk() {
        return "да";
    }
}
