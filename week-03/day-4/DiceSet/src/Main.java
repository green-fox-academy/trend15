public class Main {
    public static void main(String[] args) {
        DiceSet dice = new DiceSet();
        dice.Roll();
        int x = 0;
        for (int i = 0; i <= 5; i++) {
            System.out.println(dice.GetCurrent(i));
        }
        for (int i = 0; i <= 5; i++) {
            dice.Reroll(i);
        }
        System.out.println("-----------------------");
        for (int i = 0; i <= 5; i++) {
            System.out.println(dice.GetCurrent(i));
        }

    }
}