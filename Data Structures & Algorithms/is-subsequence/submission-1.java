class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(j);
            if (c1 == c2) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == s.length()) {
            return true;
        }

        return false;
    }
}