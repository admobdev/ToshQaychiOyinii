import java.util.Scanner;

public class GameController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ismingiz: ");
        String  player = sc.next();
        Game game = new Game(player);
        int choice = 0;
        do {
            game.playGame();
            System.out.println("Davom etish: 1\nChiqish: 2\nTanlang:");
            choice = sc.nextInt();
            System.out.println();
        }while (choice != 2);
        sc.close();
        game.showStatistics();
    }
}
