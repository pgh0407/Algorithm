import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // 1. 등장 횟수 저장
        for (int num : array) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int mode = -1;
        boolean isDuplicate = false;

        // 2. 최빈값 탐색
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int value = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq) {
                maxFreq = freq;
                mode = value;
                isDuplicate = false;
            } else if (freq == maxFreq) {
                isDuplicate = true;
            }
        }

        return isDuplicate ? -1 : mode;
    }
}