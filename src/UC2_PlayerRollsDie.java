public class UC2_PlayerRollsDie {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder game");
        int currPosition = 0;
        int DiceValue = 0;
        int PlayerPosition = 0;
        System.out.println("Player at start position = " + currPosition);
        DiceValue = (int) (Math.random() * 10) % 6 + 1;
        System.out.println("Number of the rolled dice: " + DiceValue);
        PlayerPosition = DiceValue;
        System.out.println("Now player position is = "+PlayerPosition);
    }
}
