class Solution {
    public int subtractProductAndSum(int n) {
        int result =0 , sum =0 ,product=1;

        while(n!=0){
            int digit = n%10;
            sum += digit;
            product *= digit;
            n /=10;
        }
        return result = product - sum;
    }
}