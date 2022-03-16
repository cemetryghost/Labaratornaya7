package com.company;

abstract class Animal {
    String name;
    static String food;
    static String location;
    abstract public void makeNoise();
    abstract public void makeEat();
    abstract public void makeSleep();
}

class Cat extends Animal {
    static {
        food = "Ките - кэт";
        location = "Кошачий домик";
    }
    Cat(String name) {
        this.name = name;
    }
    @Override
    public void makeNoise() {
        System.out.println(name + ": мурчит");
    }

    @Override
    public void makeEat() {
        System.out.println(name + " ест Ките - кэт");
    }

    @Override
    public void makeSleep() {
        System.out.println(name + " уснул");
    }
}

class Dog extends Animal {
    static {
        food = "Собачий корм";
        location = "на улице";
    }
    Dog(String name) {
        this.name = name;
    }
    @Override
    public void makeNoise() {
        System.out.println(name+ " рычит");
    }

    @Override
    public void makeEat() {
        System.out.println(name+" ест собачий корм Чаппи");
    }

    @Override
    public void makeSleep() {
        System.out.println(name + " уснул");
    }

}

class Horse extends Animal {
    static {
        food = "Сено";
        location = "Спец. загон";
    }
    Horse(String name) {
        this.name = name;
    }
    @Override
    public void makeNoise() {
        System.out.println(name + " ржет");
    }

    @Override
    public void makeEat() {
        System.out.println(name + " ест сено");
    }

    @Override
    public void makeSleep() {
        System.out.println(name + " уснул");
    }

}

public class Main {
    public static class Vet
    {
        static void treatAnimal(Animal animal)
        {
            System.out.println("Животное на реабилитации\nИмя: "+animal.name+"\nЕда: "+Animal.food+"\nМесто нахождение: "+Animal.location);
        }
    }
    public static void main(String[] args) {

        Horse goliaf = new Horse("Голиаф");
        Vet.treatAnimal(goliaf);
        goliaf.makeEat();
        goliaf.makeNoise();
        goliaf.makeSleep();
    }
}
