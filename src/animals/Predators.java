package animals;

public class Predators extends Mammals{
    private String typeOfFood;

    public Predators(String name, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    @Override
    public String walk() {
        return null;
    }

    @Override
    public String eat() {
        return null;
    }

    @Override
    public String sleep() {
        return null;
    }

    @Override
    public String move() {
        return null;
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
    public String getLivingEnvironment() {
        return super.getLivingEnvironment();
    }

    @Override
    public void setLivingEnvironment(String livingEnvironment) {
        super.setLivingEnvironment(livingEnvironment);
    }

    @Override
    public double getMovementSpeed() {
        return super.getMovementSpeed();
    }

    @Override
    public void setMovementSpeed(double movementSpeed) {
        super.setMovementSpeed(movementSpeed);
    }
    @Override
    public String toString() {
        return "  Хищник " + getName() + "  Возраст " + getAge() +
                " лет  Среда обитания " + getLivingEnvironment() +
                "  Скорость передвижения " + getMovementSpeed() + " км/ч  Тип пищи " + getTypeOfFood();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String hunt(){
        return "ДА";
    }
}
