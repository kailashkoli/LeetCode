class Solution {
    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim(); 
        if (s.length() == 0) {
            return 0;
        }
        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar) && firstChar != '-' && firstChar != '+') {
            return 0; 
        }
        int sign = 1;
        int i = 0;
        if (firstChar == '-' || firstChar == '+') {
            sign = (firstChar == '-') ? -1 : 1;
            i++;
        }
        long result = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int) (result * sign);
    }
}