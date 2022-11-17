public class Game extends GameItem{
    private String playerName;

    public Game(String playerName) {
        this.playerName = playerName;
    }

    private Player player = new Player();
    private Computer cpu = new Computer();
    private String playerChoice;
    private String cpuChoice;

    private int playerScore = 0;
    private int cpuScore = 0;
    private int draw = 0;

    private int totalMatches = 0;

    public void playGame(){
        totalMatches++;
        playerChoice = player.getChoice();
        cpuChoice = cpu.getChoice();
        winningState = getResult();
        displayResult();
        updateScore();
    }

    public int getResult(){
        if (playerChoice.equals(cpuChoice))  return 0;
        switch (playerChoice) {
            case STONE :   return (cpuChoice.equals(SCISSOR) ? 1 : 2);
            case PAPER:    return (cpuChoice.equals(STONE) ? 1 : 2);
            case SCISSOR:  return (cpuChoice.equals(PAPER) ? 1 : 2);
        }
        return 0;
    }

    public void displayResult(){
        switch (winningState){
            case 0 -> System.out.println("Durrang ! Foydalanuvchi - " +playerChoice + " va CPU - " + cpuChoice);
            case 1 -> System.out.println("Foydalanuvchi yutdi ! " + playerName + " - " + playerChoice + " CPU - " + cpuChoice);
            case 2 -> System.out.println("CPU yutdi ! " + cpuChoice + " va " + playerName + " - " + playerChoice);
        }
        System.out.println();
    }
    public void showStatistics(){
        System.out.println("Umumiy o'yinlar soni : " + totalMatches);
        System.out.println(playerName + ": " + playerScore + " ball");
        System.out.println("CPU: " + cpuScore + " ball");
        System.out.println("Durranglar: " + draw);
    }
    public void updateScore(){
        switch (winningState){
            case 0: draw++; break;
            case 1: playerScore++; break;
            case 2: cpuScore++; break;
        }
    }
}
