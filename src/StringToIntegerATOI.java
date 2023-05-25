package src;

public class StringToIntegerATOI {
    
    public int myAtoi(String str) {

        int index = 0; int total = 0; int n = str.length(); int sign = 1;

        while (index < n && str.charAt(index) == ' ') {
            index++;
        }

        if (index < n && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = str.charAt(index) == '+' ? 1 : -1;
        }

        while (index < n) {

            int digit = str.charAt(index) - '0';

            if ( digit < 0 || digit > 9 ) {
                break;
            }

            if (total > Integer.MAX_VALUE/10 ||
                total == Integer.MAX_VALUE/10 && 
                         Integer.MAX_VALUE%10 < digit) {

                            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                         
            }

            total = total*10 + digit;

            index++;

        }

        return total*sign;

    }


}
