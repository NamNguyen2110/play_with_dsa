package leetcode.recursion;

import java.util.Arrays;

public class ReverseString {
    public void helper(char[] s, int l, int r) {
        if (l > r) return;
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
        l++;
        r--;
        helper(s, l, r);
    }

    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }

    public static void main(String[] args) {
        char[] s = {'1', '2', '3', '4', '5'};
        new ReverseString().reverseString(s);
    }
}
