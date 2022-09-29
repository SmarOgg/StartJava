import java.util.Scanner;

public class GuessNumber {
    private int hiddenNum;
    private int startRange = 0;
    private int endRange = 100;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        init();
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Ход игрока " + currentPlayer.getName() + " : ");
            currentPlayer.setNumber(input.nextInt());
            if (currentPlayer.getNumber() > hiddenNum) {
                System.out.println("Число " + currentPlayer.getNumber() + " больше того, что загадал компьютер");
            } else if (currentPlayer.getNumber() < hiddenNum) {
                System.out.println("Число " + currentPlayer.getNumber() + " меньше того, что загадал компьютер");
            } else {
                break;
            }
            changePlayer();
        } while (true);
    }

    private void init() {
        int numPlayer = (int) (Math.random());
        hiddenNum = (int) (Math.random() * endRange) + 1;
        currentPlayer = numPlayer == 0 ? player1 : player2;
    }

    private void changePlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }
}