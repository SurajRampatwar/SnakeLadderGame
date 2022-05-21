import java.util.Scanner;

public class UC6_NoOfDiceToWin {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        int currPosition = 0;
        int DiceValue = 0;
        int PlayerPosition = 0;
        int WinPosition = 100;
        int countDice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Player at start position = " + currPosition);
        System.out.println("Current dice value = " + DiceValue);
        while ((PlayerPosition < WinPosition)) {
            DiceValue = (int) (Math.random() * 10) % 6 + 1;
            PlayerPosition = DiceValue + PlayerPosition;
            countDice++;
            if (PlayerPosition == WinPosition) {
                System.out.println("Congratulation you have won");
                System.out.println("Number of times dice rolled = " + countDice);
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

        }
    }
}


