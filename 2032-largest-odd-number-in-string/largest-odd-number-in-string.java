class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        String ans = "";
        for (int i = n - 1; i >= 0; i--) {
            char c = num.charAt(i);
            if (c % 2 == 1) {
                ans = ans.concat(num.substring(0, i + 1));
                break; 
            }
        }
        return ans;
    }
}
