public class MyFirstGame {
    public static void main(String[] args) {
        int halfIntervalStart = 0;
        int halfIntervalEnd = 100;

        int numHidden = 23;
        int numPlayer = halfIntervalEnd;

        while (numPlayer != numHidden) {
            numPlayer = halfIntervalStart + (halfIntervalEnd - halfIntervalStart) / 2;

            if (numPlayer > numHidden) {
                System.out.println("Число " + numPlayer + " больше того, что загадал компьютер");
                halfIntervalEnd = numPlayer;
            } else if (numPlayer < numHidden) {
                System.out.println("Число " + numPlayer + " меньше того, что загадал компьютер");
                halfIntervalStart = numPlayer;
            }
        }

        System.out.println("Вы победили!");
    }
}