package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setSex("male");
        wolf.setNickname("John");
        wolf.setWeight(17.2f);
        wolf.setAge(6);
        wolf.setColor("red");

        System.out.printf("Пойман волк по кличке %s(%s), весом %.1f, возраст %d лет, %s цвета%n",
                wolf.getNickname(), wolf.getSex(), wolf.getWeight(), 
                wolf.getAge(), wolf.getColor());

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}