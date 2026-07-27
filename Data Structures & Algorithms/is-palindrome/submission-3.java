// class Solution {
//     public boolean isPalindrome(String s) {
//         if(s.length() <= 1) return true;
//         s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       
//         int l = 0; int r = s.length()-1;
//         while(l <= r){
//             if(s.charAt(l) != s.charAt(r)) return false;
//             l++;
//             r--;
//         }
//         return true;
//     }
//     // public static void main(String[] args){
//     //     String s = "Was it a car or a cat I saw?"
//     //     Solution ans = new Solution;
//     //     System.out.println(ans.isPalindrome(s));
//     // }
// }

// time nd space of above is O(N);
//but by 2 ptr it is )(1) for space as we do inplce string modification 

class Solution{

    public boolean isPalindrome(String s){

        int l = 0; int r = s.length()-1;

        while(l<r){
            while(l<r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while(l<r && !Character.isLetterOrDigit(s.charAt(r))) r--;

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;

            l++;
            r--;
        }

        return true;
    }
    // public static void main(String[] args){
    //     String s = "Was it a car or a cat I saw?";
    //     Solution ans = new Solution();
    //     System.out.println(ans.isPalindrome(s));
    // }
}