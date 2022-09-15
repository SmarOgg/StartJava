public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.sex = "male";
        wolf.nickname = "John";
        wolf.weight = 17.2f;
        wolf.age = 6;
        wolf.color = "red";

        System.out.printf("Пойман волк по кличке %s(%s), весом %.1f, возраст %d лет, %s цвета%n",
                wolf.nickname, wolf.sex, wolf.weight, wolf.age, wolf.color);

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}