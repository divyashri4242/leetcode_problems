class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int liters = 0;

        while (mainTank >= 5) {
            mainTank -= 5;
            liters += 5;

            if (additionalTank >= 1) {
                mainTank += 1;
                additionalTank -= 1;
            }
        }

        return (liters + mainTank) * 10;
    }
}
