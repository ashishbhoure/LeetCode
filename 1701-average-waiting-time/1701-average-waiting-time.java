class Solution {
    public double averageWaitingTime(int[][] customers) {
        int lastDoneOrder = customers[0][0];
        double totalTime = 0;
        int count = 0;
        for(int i=0;i<customers.length;i++){
            int prepareTime = Math.max(lastDoneOrder,customers[i][0]) + customers[i][1];
            int waitingTime = prepareTime - customers[i][0];
            totalTime += waitingTime;
            lastDoneOrder = prepareTime;
            count++;
        }
        return totalTime/count;
    }
}