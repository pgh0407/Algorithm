class Solution {
    public int solution(int angle) {
        int answer = angle - 90;
        
        if (answer < 0) {
        return 1;    
        }
        else if (answer == 0) {
        return 2;
        }
        else if (90 > answer && answer > 0 ) {
        return 3;
        }
        else {
        return 4;
        }
    }
}