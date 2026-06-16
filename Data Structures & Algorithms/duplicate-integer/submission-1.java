class Solution {
    public boolean hasDuplicate(int[] nums) {


        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;

        for(int i=0; i<n; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;

        // int n = nums.length;

        // for(int i=0; i<n-1; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
    }
}