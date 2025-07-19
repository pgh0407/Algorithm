
import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        Arrays.sort(array);
        int middleIndex = array.length / 2; // 중앙 인덱스 계산
        return array[middleIndex]; // 중앙값 반환
    }
}