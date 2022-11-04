package animals;

public abstract class Mammals extends Animals {
    private String livingEnvironment;
    private double movementSpeed;

    public Mammals(String name, int age, String livingEnvironment, double movementSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        this.movementSpeed = movementSpeed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public double getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(double movementSpeed) {
        if (movementSpeed > 0) {
            this.movementSpeed = movementSpeed;
        }
    }

    public abstract String walk();

    @Override
    public abstract String eat();

    @Override
    public abstract String sleep();

    @Override
    public abstract String move();

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
