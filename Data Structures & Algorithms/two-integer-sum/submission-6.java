// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        int[] arr = new int[2];
       

//         for(int i = 0; i < nums.length; i++){
//             for(int j = 1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target && i != j){
//                     // arr[0] = Math.min(i, j);
//                     arr[0] = i;
//                     arr[1] = j;
//                     // arr[1] = Math.max(i, j);
//                     return arr;
//                 } 
//             }
//         }
//         return arr;
//     }
// }


//optimal by hash map;
// class Solution{
//     public int[] twoSum(int[] nums, int target){
//         HashMap<Integer,Integer>map = new HashMap<>();

//         for(int i = 0;i<nums.length; i++){
//             int compliment = target - nums[i];
            
//             if(map.containsKey(compliment)){
//                 return new int[]{ map.get(compliment),i};
//             }

//             map.put(nums[i],i);
//         }
//         return new int[]{};
//     }
// }

//more better way
class Solution{
    public int[] twoSum(int[] nums, int target){
       
        Map<Integer,Integer>map = new HashMap<>();

        for(int i = 0; i< nums.length; i++){

            if(map.containsKey(target - nums[i])){
               return new int[] {map.get(target-nums[i]), i};
            }
            else{
                 map.put(nums[i], i);
            }
        }
        return new int[] {0,0};
    }
}


//brute O(N*N)
// import java.util.*;
// class Solution{
//     public int[] twoSum(int[] nums, int target){
//         int[] arr = new int[2];
//         for(int i = 0; i < nums.length; i++){
//             for(int j = 1; j < nums.length; j++){
//                 if(nums[i] + nums[j] == target && i != j){
//                     arr[0] = Math.min(i,j);
//                     arr[1] = Math.max(i,j);
//                     return arr;
//                 }
//             }
//         }
//         return arr;
//     }
//     public static void main(String[] args){
//         int[] array = {2,4,5,3,4,1};
//         int t = 6;
//         Solution ans = new Solution();
//         System.out.println(Arrays.toString(ans.twoSum(array,t)));
        
//     }
// }
