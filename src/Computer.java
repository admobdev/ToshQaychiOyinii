import java.util.Random;

public class Computer extends GameItem{
    private Random rand = new Random();

    public String getChoice (){
        int randThinking = 1 + rand.nextInt(3);
        System.out.print("CPU");
        for (int i = 0; i < randThinking; i++) {
            try {
                Thread.sleep( 1000);
                System.out.print(".");
            } catch (InterruptedException e) {}
        }
        System.out.println();
        int choice = 1 + rand.nextInt(3);
        return switch (choice){
            case 1 -> STONE;
            case 2 -> PAPER;
            default -> SCISSOR;
        };
    }
}
