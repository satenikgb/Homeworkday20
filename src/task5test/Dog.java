package task5test;

import task5.Animal;

public class Dog extends Animal {
    @Override
    protected void getWeight(float weight) {
        System.out.println("Dog weight is"+weight);
    }

    @Override
    protected void getName(String name) {
        System.out.println("dog name is"+name);;
    }

    @Override
    protected void getAge(int age) {
        System.out.println("Dog age is"+age);
    }
}
