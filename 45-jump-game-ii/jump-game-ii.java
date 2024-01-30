class Solution {
    public int jump(int[] nums) {
        if ( nums.length <2){
            return 0;
        }
        int current = nums[0];
        int next = nums[0];
        int jumps = 1;
        for(int i =1; i< nums.length; i++){
            next = Math.max( nums[i]+i, next);
            if( i == current && i!= nums.length-1){
                jumps++;
                current = next;
            }
        }

        return jumps;
        
    }
}