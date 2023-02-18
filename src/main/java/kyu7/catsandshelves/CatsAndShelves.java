package kyu7.catsandshelves;

public class CatsAndShelves {
    public static double solution(int start, int finish)
    {
        double difference = finish - start;
        double position = Math.floor((difference / 3) + (difference % 3));
        return position;
    }
}