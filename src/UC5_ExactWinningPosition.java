import java.util.Scanner;

public class UC5_ExactWinningPosition {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        int currPosition = 0;
        int DiceValue = 0;
        int PlayerPosition = 0;
        int WinPosition = 100;
        Scanner scan = new Scanner(System.in);
        System.out.println("Player at start position = " + currPosition);
        System.out.println("Current dice value = " + DiceValue);
        System.out.println("Decide play or not press Y or N");
        String play = scan.next();
        if ("y".equals(play)) {
            while ((PlayerPosition < WinPosition)) {
                System.out.println("Roll the dice press r");
                String roll = scan.next();
                if ("r".equals(roll)) {
                    DiceValue = (int) (Math.random() * 10) % 6 + 1;
                    PlayerPosition = DiceValue + PlayerPosition;
                    if (PlayerPosition == WinPosition) {
                        System.out.println("Congratulation you have won");
                    } else if (PlayerPosition > WinPosition) {
                        PlayerPosition = PlayerPosition - DiceValue;
                    } else {
                        switch (PlayerPosition) {
                            case 25:
                                System.out.println("snake bite");
                                PlayerPosition = 5;
                                break;
                            case 45:
                                System.out.println("snake bite");
                                PlayerPosition = 10;
                                break;
                            case 55:
                                System.out.println("snake bite");
                                PlayerPosition = 15;
                                break;
                            case 65:
                                System.out.println("snake bite");
                                PlayerPosition = 20;
                                break;
                            default:
                                PlayerPosition = PlayerPosition;
                                break;
                        }
                        switch (PlayerPosition) {
                            case 2:
                                PlayerPosition = 35;
                                System.out.println("You get Ladder");
                                break;
                            case 12:
                                PlayerPosition = 48;
                                System.out.println("You get Ladder");
                                break;
                            case 23:
                                PlayerPosition = 60;
                                System.out.println("You get Ladder");
                                break;
                            case 38:
                                PlayerPosition = 95;
                                System.out.println("You get Ladder");
                                break;
                            default:
                                PlayerPosition = PlayerPosition;
                                break;
                        }
                    }
                    System.out.println("Current dice value = " + DiceValue);
                    System.out.println("Player  position = " + PlayerPosition);
                } else {
                    System.out.println("Invalid key");
                }
            }
        } else {
            System.out.println("Quit Game");
        }
    }

}
