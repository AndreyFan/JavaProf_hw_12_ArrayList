package de.telran.hw_12_ArrayLists;

import java.util.Objects;

public class Human {
    public String name;
    public String surname;
    public int age;
    public String eyeColor;

    public Human(String name, String surname, int age, String eyeColor) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name=' " + name + '\'' +
                ", surname=' " + surname + '\'' +
                ", age=  " + age +
                ", eyeColor='  " + eyeColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(eyeColor, human.eyeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, eyeColor);
    }
}
