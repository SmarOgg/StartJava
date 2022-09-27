import java.util.Scanner;

public class GuessNumber {
    int hiddenNum;
    int startRange = 0;
    int endRange = 100;
    Player player1;
    Player player2;
    Player firstPlayer;
    boolean isGuessed;
    int playerNum;

    public GuessNumber (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void init() {
        int numPlayer = (int) (Math.random());
        
        hiddenNum = randomNumber();
        if (numPlayer == 0) {
            firstPlayer = player1;
        } else {
            firstPlayer = player2;
        }

        isGuessed = false;
    }

    public void start() {
        init();
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Ход игрока " + firstPlayer.getName() + " : ");
            playerNum = input.nextInt();
            if (playerNum > hiddenNum) {
                System.out.println("Число " + playerNum + " больше того, что загадал компьютер");
                changeFirstPlayer();
            } else if (playerNum < hiddenNum) {
                System.out.println("Число " + playerNum + " меньше того, что загадал компьютер");
                changeFirstPlayer();
            } else {
                isGuessed = true;
            }
        } while (!isGuessed);
    }

    private int randomNumber() {
        return (int) (Math.random() * endRange) + 1;
    }

    private void changeFirstPlayer() {
        if (firstPlayer == player1) {
            firstPlayer = player2;
        } else {
            firstPlayer = player1;
        }
    }
}