package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger strikerEureka = new Jaeger();
        Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", "Russia", 85.34f, 2.412f, 10, 10);

        strikerEureka.setModelname("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.2f);
        strikerEureka.setWeight(1.85f);
        strikerEureka.setArmor(9);

        System.out.println("Обнаружены роботы :");
        System.out.printf("Modelname ->\t%s\t| %s%n",
                strikerEureka.getModelName(), chernoAlpha.getModelName());
        System.out.printf("Mark -> \t%s\t\t| %s%n",
                strikerEureka.getMark(), chernoAlpha.getMark());
        System.out.printf("Origin ->\t%s \t| %s%n",
                strikerEureka.getOrigin(), chernoAlpha.getOrigin());
        System.out.printf("Height ->\t%.2f \t\t| %.2f%n",
                strikerEureka.getHeight(), chernoAlpha.getHeight());
        System.out.printf("Weight ->\t%.2f \t\t| %.2f%n",
                strikerEureka.getWeight(), chernoAlpha.getWeight());
        System.out.printf("Strength ->\t%d \t\t| %d%n",
                strikerEureka.getStrength(), chernoAlpha.getStrength());
        System.out.printf("Armor ->\t%d \t\t| %d%n",
                strikerEureka.getArmor(), chernoAlpha.getArmor());
        
    }
}