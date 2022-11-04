package animals;

import java.util.Objects;

public class Herbivores extends Mammals{
    private String typeOfFood;

    public Herbivores(String name, int age, String livingEnvironment, double movementSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, movementSpeed);
        this.typeOfFood = typeOfFood;
    }

    @Override
    public String walk() {
        return " гуляет ";
    }

    @Override
    public String eat() {
        return " Питается ";
    }

    @Override
    public String sleep() {
        return " спит ";
    }

    @Override
    public String move() {
        return " передвигается ";
    }

    @Override
    public String
    getName() {
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
        return "  Травоядное " + getName() + "  Возраст " + getAge() +
                " лет  Среда обитания " + getLivingEnvironment() +
                "  Скорость передвижения " + getMovementSpeed() + " км/ч  Тип пищи " + getTypeOfFood();
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood != null && !typeOfFood.isEmpty() && !typeOfFood.isBlank()) {
            this.typeOfFood = typeOfFood;
        }
    }

    public String graze(){
        return " пасётся ";
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


