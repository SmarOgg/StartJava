import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        boolean running = false;
        String answer;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя первого игрока :");
        Player player1 = new Player(input.next());
        System.out.print("Введите имя второго игрока :");
        Player player2 = new Player(input.next());

        GuessNumber game = new GuessNumber(player1, player2);
        running = true;

        while (running) {
            do {
                game.start();
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = input.next();
                if (answer.equals("no")) {
                    running = false;
                }
            } while (!answer.equals("no") && answer.equals("yes"));
        }
    }
}