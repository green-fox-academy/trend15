import java.util.ArrayList;
import java.util.List;

public class DiceSet {
    List<Integer> summary = new ArrayList<Integer>();

    void Roll() {
        for (int i = 0; i <= 5; i++) {
            summary.add((int) (Math.random() * 6) + 1);
        }
    }

    int GetCurrent(int x) {
        return summary.get(x);
    }

    void Reroll(int y) {
        int counter = 0;
        if (summary.get(y) != 6) {
            do {
                summary.set(y, ((int) (Math.random() * 6) + 1));
                counter++;
            } while (summary.get(y) != 6);
        }
    }
}
