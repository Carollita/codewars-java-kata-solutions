package kyu8.beginnerreducebutgrow;

public class BeginnerReduceButGrow {

    public static int grow(int[] x){
        int result = 1;

        for (int i : x) {
            result = i * result;
        }
        return result;
    }
}