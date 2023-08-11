package kyu8.sumofpositive;

public class SumOfPositive {
    public static int sum(int[] arr) {
        int arrSum = 0;
        for (int i : arr) {
            if (i > 0) {
                arrSum = i + arrSum;
            }
        }
        return arrSum;
    }
}
