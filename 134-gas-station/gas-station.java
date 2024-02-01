class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int sumGas = 0;
        int sumCost = 0;

        for(int i =0; i<gas.length; i++){
            sumGas += gas[i];
            sumCost += cost[i];
        }

        if(sumCost > sumGas){
            return -1;
        }

        int res = 0;
        int totalGas = 0;

        for( int i =0; i< gas.length; i++){
            int diff = gas[i] - cost[i];
            totalGas += diff;

            if( totalGas < 0 ){
                res = i+1;
                totalGas = 0;
            }
        }

        return res;
    }
}