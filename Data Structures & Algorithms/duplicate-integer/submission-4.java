class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
    // public static void main(String[] args){
    //     int[] nums = {1,2,3,4,5,6,7};
    //     Solution ans = new Solution();
    //     System.out.println(ans.hasDuplicate(nums));
    // }
}