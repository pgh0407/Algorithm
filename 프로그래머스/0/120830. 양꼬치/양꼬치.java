class Solution {
    public int solution(int n, int k) {
        int freeDrinks = n / 10;
        int paidDrinks = k - freeDrinks;
        return (n * 12000) + (paidDrinks * 2000);
    }
}