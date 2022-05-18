import java.util.Scanner;

public class UC3_1_PlayerCheckOption {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        int currPosition = 0;
        int DiceValue = 0;
        int PlayerPosition = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Player at start position = " + currPosition);
        System.out.println("Current dice value = " + DiceValue);
        DiceValue = (int) Math.floor(Math.random() * 10) % 6 + 1;
        PlayerPosition = DiceValue;
        System.out.println("Decide play or not press Y or N");
        String play = scan.next();
        while ("y".equals(play)) {
            PlayerPosition = DiceValue + currPosition;
            switch (PlayerPosition) {
                case 25:
                    System.out.println("If snake bite");
                    PlayerPosition = 5;
                    break;
                case 45:
                    System.out.println("If snake bite");
                    PlayerPosition = 10;
                    break;
                case 55:
                    System.out.println("If snake bite");
                    PlayerPosition = 15;
                    break;
                case 65:
                    PlayerPosition = 20;
                    break;
                default:
                    PlayerPosition = PlayerPosition;
                    break;
            }
            switch (PlayerPosition) {
                case 2:
                    PlayerPosition = 35;
                    break;
                case 12:
                    PlayerPosition = 48;
                    break;
                case 23:
                    PlayerPosition = 60;
                case 38:
                    PlayerPosition = 95;
                    break;
                default:
                    PlayerPosition = PlayerPosition;
                    break;
            }
            System.out.println("Player at start position = " + PlayerPosition);
            System.out.println("Current dice value = " + DiceValue);
            break;
        }

    }
}
