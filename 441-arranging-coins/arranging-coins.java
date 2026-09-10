class Solution {
    public int arrangeCoins(int n) {
        int step = 0;
        while(n>= step){
            n = n-step;
            step++;
        }
        return step-1;
    }
}
