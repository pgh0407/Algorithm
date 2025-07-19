class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int top = numer1 * denom2 + numer2 * denom1;   // 분자 통분 및 합
        int bottom = denom1 * denom2;                  // 공통 분모

        int gcd = getGCD(top, bottom);                 // 최대공약수 구하기

        int[] answer = {top / gcd, bottom / gcd};      // 약분한 결과 반환
        return answer;
    }

    // 최대공약수(GCD) 구하는 메서드: 유클리드 호제법
    private int getGCD(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}