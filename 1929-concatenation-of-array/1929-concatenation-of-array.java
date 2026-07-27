class Solution {
    public int[] getConcatenation(int[] nums) {

        int k []= new int [2*nums.length];
        for (int i = 0 ; i < nums.length;i++){
            k [i] = nums[i];
            k[i+nums.length] = nums[i]; 
        }
        return k;


        
    }
}