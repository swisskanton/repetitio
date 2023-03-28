import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiceSet {
    ArrayList<Integer> dice = new ArrayList<>();

    public void rollSet() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
    }

    public List<Integer> getCurrentSet() {
        return dice;
    }

    public int getCurrentItem(int i) {
        return dice.get(i);
    }

    public void rerollSet() {
        dice.replaceAll(ignored -> (int) (Math.random() * 6) + 1);
    }

    public void rerollItem(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with the rollSet() method
        // You can check the current rolled numbers with getCurrentSet() and getCurrentItem() method
        // You can reroll all with the rerollSet(), or reroll one with the rerollItem() method
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
        System.out.println(diceSet.getCurrentSet());
        diceSet.rollSet();
        System.out.println(diceSet.getCurrentSet());
        System.out.println(diceSet.getCurrentItem(5));
        diceSet.rerollSet();
        System.out.println(diceSet.getCurrentSet());
        diceSet.rerollItem(4);
        System.out.println(diceSet.getCurrentSet());

        if (!diceSet.getCurrentSet().equals(Arrays.asList(6,6,6,6,6,6))) {
            for (int i = 0; i < diceSet.getCurrentSet().size(); i++) {
                while (diceSet.getCurrentItem(i) != 6) {
                    diceSet.rerollItem(i);
                }
            }
            System.out.println(diceSet.getCurrentSet());
        }
    }
}