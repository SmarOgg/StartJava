public class MyFirstGame {
    public static void main(String[] args) {
        int startRange = 0;
        int endRange = 100;

        int numHidden = 23;
        int numPlayer = endRange;

        while (numPlayer != numHidden) {
            numPlayer = startRange + (endRange - startRange) / 2;

            if (numPlayer > numHidden) {
                System.out.println("Число " + numPlayer + " больше того, что загадал компьютер");
                endRange = numPlayer;
            } else if (numPlayer < numHidden) {
                System.out.println("Число " + numPlayer + " меньше того, что загадал компьютер");
                startRange = numPlayer;
            }
        }

        System.out.println("Вы победили!");
    }
}