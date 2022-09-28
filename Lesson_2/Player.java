public class Player {
    private String name;
    private int playerNum;

    public Player(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public int getPlayerNum() {
        return playerNum;
    }
}