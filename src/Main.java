import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] toSort = new Integer[]{15, 65, 97, 31, 52, 98, 87, 99, 100, 21, 6, 7};
        Integer[] sorted = lotterySort(toSort);
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + " ");
        }
    }

    static Integer[] lotterySort(Integer[] toSort) {
        while (true) {
            List<Integer> shuffledList = Arrays.asList(toSort);
            Collections.shuffle(shuffledList);
            boolean isSorted = true;
            for (int i = 0; i < (shuffledList.size() - 1); i++) {
                int elementOne = shuffledList.get(i);
                int elementTwo = shuffledList.get(i + 1);
                if (elementOne > elementTwo) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) {
                return shuffledList.toArray(new Integer[0]);
            }
        }
    }
}