class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1) return true;
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       
        int l = 0; int r = s.length()-1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    // public static void main(String[] args){
    //     String s = "Was it a car or a cat I saw?"
    //     Solution ans = new Solution;
    //     System.out.println(ans.isPalindrome(s));
    // }
}