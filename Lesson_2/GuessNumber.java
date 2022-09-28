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
            currentPlayer.setPlayerNum(input.nextInt());
            if (currentPlayer.getPlayerNum() > hiddenNum) {
                System.out.println("Число " + currentPlayer.getPlayerNum() + " больше того, что загадал компьютер");
                changeFirstPlayer();
            } else if (currentPlayer.getPlayerNum() < hiddenNum) {
                System.out.println("Число " + currentPlayer.getPlayerNum() + " меньше того, что загадал компьютер");
                changeFirstPlayer();
            }
        } while (currentPlayer.getPlayerNum() != hiddenNum);
    }

    private void init() {
        int numPlayer = (int) (Math.random());
        
        hiddenNum = randomNumber();
        if (numPlayer == 0) {
            currentPlayer = player1;
        } else {
            currentPlayer = player2;
        }
    }

    private int randomNumber() {
        return (int) (Math.random() * endRange) + 1;
    }

    private void changeFirstPlayer() {
        currentPlayer = currentPlayer == player1 ? player2 : player1;
    }
}