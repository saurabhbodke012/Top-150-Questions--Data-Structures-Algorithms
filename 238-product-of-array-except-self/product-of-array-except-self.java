class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] arr = new int[nums.length];
        int rSum = 1;
        arr[0] = 1;
        for(int i =1; i<nums.length; i++){
            arr[i] = arr[i-1] * nums[i-1];
        }
        

        arr[nums.length-1] = rSum * arr[nums.length-1];

        for(int i = nums.length-2; i>=0; i--){
            rSum *= nums[i+1];
            arr[i] = arr[i] * rSum;
        }
        
        return arr;
    }
}