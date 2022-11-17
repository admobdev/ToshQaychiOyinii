import java.util.Scanner;

public class Player extends GameItem{
    private String playerName;
    private Scanner sc = new Scanner(System.in);

    public String getChoice(){
        System.out.println("1: Tosh ");
        System.out.println("2: ✀");
        System.out.println("3: 📃");
        System.out.println("Tanlang: ");
       return switch (sc.nextInt()){
            case 1 -> STONE;
            case 2 -> PAPER;
           default -> SCISSOR;
        };
    }
}
