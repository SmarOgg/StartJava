import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя первого игрока :");
        Player player1 = new Player(input.next());
        System.out.print("Введите имя второго игрока :");
        Player player2 = new Player(input.next());

        GuessNumber game = new GuessNumber(player1, player2);
        String answer;

        do {
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answer = input.next();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}