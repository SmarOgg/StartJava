import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Write once, run anywhere! Привет.");
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("Введите свое имя :");
        System.out.println(console.nextLine());
    }
}