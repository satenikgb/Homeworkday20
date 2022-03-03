package task5;

public abstract class Animal {
    protected float weight;
    protected String name;
    protected int age;

    protected abstract void getWeight(float weight);

    protected abstract void getName(String name);

    protected abstract void getAge(int age);

}

