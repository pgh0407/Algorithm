import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n)
                        .filter(i -> i % 2 == 1)
                        .toArray();
    }
}