import java.util.Scanner;

public class MyFirstApp {
    public static void main(String[] args) {
        System.out.println("Write once, run anywhere! ������.");
        Scanner console = new Scanner(System.in, "cp866");
        System.out.print("������� ���� ��� :");
        System.out.println(console.nextLine());
    }
}